package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.util.Log;

import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DemonHide-RB on 10/4/2016.
 */
public class ItemAvaliacaoDAO implements DAO<ItemAvaliacao>{

    private DatabaseHelper databaseHelper;
    private static RuntimeExceptionDao<ItemAvaliacao, Integer> itemAvaliacaoReDAO;

    private ItemAvaliacaoDAO() {
    }

    public ItemAvaliacaoDAO(Context context) {
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
        itemAvaliacaoReDAO = databaseHelper.getItemAvaliacaoRuntimeExceptionDao();
    }

    public ItemAvaliacao inserir(ItemAvaliacao itemAvaliacao) {
        if(buscarPorID(itemAvaliacao) != null) {
            ItemAvaliacao antigoItemAvaliacao = buscarPorID(itemAvaliacao);

            antigoItemAvaliacao.setConformidade(itemAvaliacao.getConformidade());
            antigoItemAvaliacao.setDescricao(itemAvaliacao.getDescricao());
            antigoItemAvaliacao.setFoto(itemAvaliacao.getFoto());

            alterar(antigoItemAvaliacao);

            itemAvaliacao = antigoItemAvaliacao;
        } else {
            itemAvaliacaoReDAO.create(itemAvaliacao);
        }

        return itemAvaliacaoReDAO.queryForId(itemAvaliacao.getCodigo());
    }

    public void alterar(ItemAvaliacao itemAvaliacao) {

        itemAvaliacaoReDAO.update(itemAvaliacao);
    }

    public ItemAvaliacao buscarPorID(ItemAvaliacao itemAvaliacao) {
        QueryBuilder<ItemAvaliacao, Integer> qb = itemAvaliacaoReDAO.queryBuilder();

        try {
            itemAvaliacao = qb.where().eq(ItemAvaliacao.PERGUNTA_FIELD_NAME, itemAvaliacao.getPergunta())
                                .and().eq(ItemAvaliacao.PLANO_ACAO_FIELD_NAME, itemAvaliacao.getPlanoAcao().getCodigo()).query().get(0);
        } catch (Exception e) {
            Log.i("fail","fetching pergunta:" + itemAvaliacao.getPergunta() +"(" + itemAvaliacao.getPlanoAcao().getCodigo() + ")");
            return null;
        }

        return itemAvaliacao;
    }

    public List<ItemAvaliacao> buscarPorPlanoAcao(PlanoAcao planoAcao) {
        QueryBuilder<ItemAvaliacao, Integer> qb = itemAvaliacaoReDAO.queryBuilder();
        List<ItemAvaliacao> listaItensAvaliacao = new ArrayList<ItemAvaliacao>();

        try {
            listaItensAvaliacao = qb.where().eq(ItemAvaliacao.PLANO_ACAO_FIELD_NAME, planoAcao.getCodigo()).query();
        } catch (Exception e) {
            Log.i("fail","fetching plano de acao (" + planoAcao.getCodigo() + ") não existe");
            return null;
        }

        return listaItensAvaliacao;
    }

    public List<ItemAvaliacao> buscarPorAreaAvaliada(PlanoAcao planoAcao, String areaAvaliada) {
        QueryBuilder<ItemAvaliacao, Integer> qb = itemAvaliacaoReDAO.queryBuilder();
        List<ItemAvaliacao> listaItensAvaliacao = new ArrayList<ItemAvaliacao>();

        try {
            listaItensAvaliacao = qb.where().eq(ItemAvaliacao.PLANO_ACAO_FIELD_NAME, planoAcao.getCodigo())
                                            .and().eq(ItemAvaliacao.AREA_AVALIADA_FIELD_NAME, areaAvaliada).query();
        } catch (Exception e) {
            Log.i("fail","fetching plano de acao (" + planoAcao.getCodigo() + ") não existe");
            return null;
        }

        return listaItensAvaliacao;
    }

    public List<ItemAvaliacao> buscarPorAreaAvaliadaConformidade(PlanoAcao planoAcao, String areaAvaliada, String conformidade) {
        QueryBuilder<ItemAvaliacao, Integer> qb = itemAvaliacaoReDAO.queryBuilder();
        List<ItemAvaliacao> listaItensAvaliacao = new ArrayList<ItemAvaliacao>();

        try {
            listaItensAvaliacao = qb.where().eq(ItemAvaliacao.PLANO_ACAO_FIELD_NAME, planoAcao.getCodigo())
                    .and().eq(ItemAvaliacao.AREA_AVALIADA_FIELD_NAME, areaAvaliada)
                    .and().eq(ItemAvaliacao.CONFORMIDADE_FIELD_NAME, conformidade).query();
        } catch (Exception e) {
            Log.i("fail","fetching plano de acao (" + planoAcao.getCodigo() + ") não existe");
            return null;
        }

        return listaItensAvaliacao;
    }

    @Override
    public List<ItemAvaliacao> listar() {

        return itemAvaliacaoReDAO.queryForAll();
    }
}

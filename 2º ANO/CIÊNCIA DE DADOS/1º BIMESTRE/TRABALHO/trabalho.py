import streamlit as st
import pandas as pd

@st.cache_data
def load_data():
    df_p = pd.read_csv('nba_team_stats_playoffs_00_to_21.csv', encoding='utf-8-sig')
    df_j = pd.read_csv('amostra_database_24_25.csv', encoding='utf-8-sig')
    df_r = pd.read_csv('amostra_nba_team_stats_00_to_23.csv', encoding='utf-8-sig')
    return df_p, df_j, df_r

df_playoffs, df_players, df_regular = load_data()

# SELEÇÃO DA BASE
opcao = st.selectbox("Selecione a base de dados:", ["Playoffs", "Jogadores", "Temporada Regular"])

# FILTRO E EXIBIÇÃO DA TABELA
if opcao == "Playoffs":
    st.write("### Tabela: Estatísticas de Playoffs ###")
    pts = st.slider("Filtrar por Mínimo de Pontos", 80, 120, 100)
    dados = df_playoffs[df_playoffs['points'] >= pts]
    st.dataframe(dados)

elif opcao == "Jogadores":
    st.write("### Tabela: Performance de Jogadores ###")
    pts = st.slider("Filtrar por Mínimo de Pontos", 0, 70, 20)
    dados = df_players[df_players['PTS'] >= pts]
    st.dataframe(dados)

else:
    st.write("### Tabela: Temporada Regular ###")
    vitorias = st.slider("Filtrar por Mínimo de Vitórias", 0, 82, 40)
    dados = df_regular[df_regular['wins'] >= vitorias]
    st.dataframe(dados)
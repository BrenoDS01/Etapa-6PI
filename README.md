# SENAC PI Raquel FIT
Este é um projeto criado para o curso de TDS do Senac
# Tecnologias
JAVA
MYSQL
# Desenvolvedores
Breno Rodrigues
# Objetivo
Ser utilizados por professores ou profissionais da área de educação física, onde podem gerenciar seu trabalho de uma forma melhor
# Funcionalidades
Esse sistema tem o seu CRUD completo, onde envolve cadastro, busca, atualizações e excluir informações
# Status
O projeto está em desenvolvimento, mas está praticamente finalizado


# ETAPA 6


Criei uma nova classe de serviço: rft.service.PreService.

Ela encapsula as chamadas à classe LoginFuncao (que contém as queries SQL).

Objetivo: desacoplar a UI (frames/telas) da lógica/DAO e aplicar o princípio da responsabilidade única (uma camada de serviço só cuida das regras/integração).

Atualizei automaticamente PresencaTabela.java para usar a nova PreService em vez de chamar LoginFuncao diretamente:

LoginFuncao.listarPresenca() → new PreService().listarPresenca()

LoginFuncao.buscarPorNomePr(...) → new PreService().buscarPorNome(...)

Criei uma nova camada de serviço, chamada PreService.java
(local: src/rft/service/PreService.java)
Ela serve como um meio termo entre a interface e o banco.
Agora, a tela não acessa mais o banco direto.
Ela chama um serviço, que chama o DAO.

## Notas de aula referentes ao módulo 4 do curso de git e github da potência feminina

### Forkando repositórios
    1 - No github clicar no fork para clonar o repositório para sua conta
    2 - Na sua conta, copiar o caminho do clone
    3 - No terminal comando: git clone "caminho copiado no passo 2"
    
### Mantendo repositórios atualizados
    Dá pra fazer pelo github ou por linha de comando:
    1 - comando: git remote add upstream "caminho do repositório mãe"
    2 - vamos atualizar (obs: o fetch é tipo um pull), comando: git fetch upstream
    3 - para nos dar as atualizações - comando: git rebase upstream/master 

### Criando uma branch para enviar minhas atualizações para a upstream
    1 - modificar o algum arquivo do repositório
    2 - comando: git add . 
    3 - comando: git commit -m "..."
    4 - comando: git push
        dentro do git push ele já vai dar a opção de fazer pull request
        "remote: Create a pull request for 'add-my-user-dafne' on GitHub by visiting:
        remote:      https://github.com/DafneBarbosa/potencia-feminina-git-e-github/pull/new/add-my-user-dafne"
    5 - clica no link da pull request que vai te jogar pro github
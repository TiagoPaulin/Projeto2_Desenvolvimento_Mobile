package com.example.projeto2_somativa

// Função para simular um arquivo JSON
fun feed(): String = """
    [
      {
        "description": "Qual é a capital da França?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Londres", "isCorrect": false},
          {"description": "Paris", "isCorrect": true},
          {"description": "Berlim", "isCorrect": false},
          {"description": "Madrid", "isCorrect": false}
        ]
      },
      {
        "description": "Quem foi a primeira pessoa a viajar para o Espaço?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Yuri Gagarin", "isCorrect": true},
          {"description": "A cadela Laika", "isCorrect": false},
          {"description": "Neil Armstrong", "isCorrect": false},
          {"description": "Buzz Aldrin", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a montanha mais alta do mundo?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Mauna Kea", "isCorrect": false},
          {"description": "Dhaulagiri", "isCorrect": false},
          {"description": "Monte Everest", "isCorrect": true},
          {"description": "Pico da Neblina", "isCorrect": false}
        ]
      },
      {
        "description": "Onde se localiza Machu Picchu?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Colômbia", "isCorrect": false},
          {"description": "Peru", "isCorrect": true},
          {"description": "Venezuela", "isCorrect": false},
          {"description": "Bolívia", "isCorrect": false}
        ]
      },
      {
        "description": "Que país tem o formato de uma bota?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Butão", "isCorrect": false},
          {"description": "Portugal", "isCorrect": false},
          {"description": "Itália", "isCorrect": true},
          {"description": "Espanha", "isCorrect": false}
        ]
      },
      {
        "description": "Quem inventou a lâmpada?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Graham Bell", "isCorrect": false},
          {"description": "Thomas Edison", "isCorrect": true},
          {"description": "Henry Ford", "isCorrect": false},
          {"description": "Santos Dumont", "isCorrect": false}
        ]
      },
      {
        "description": "Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Aproximadamente 24 horas", "isCorrect": true},
          {"description": "365 dias", "isCorrect": false},
          {"description": "365 ou 366 dias", "isCorrect": false},
          {"description": "30 ou 31 dias", "isCorrect": false}
        ]
      },
      {
        "description": "A que temperatura a água ferve?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "102 ºC", "isCorrect": false},
          {"description": "99 ºC", "isCorrect": false},
          {"description": "101 ºC", "isCorrect": false},
          {"description": "100 ºC", "isCorrect": true}
        ]
      },
      {
        "description": "Quais são as fases da Lua?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Penumbral, lunar parcial, lunar total e cheia", "isCorrect": false},
          {"description": "Nova, cheia, minguante e lua de sangue", "isCorrect": false},
          {"description": "Nova, crescente, cheia e minguante", "isCorrect": true},
          {"description": "Nova, crescente, cheia, minguante e lua de sangue", "isCorrect": false}
        ]
      },
      {
        "description": "Quantos ossos temos no nosso corpo?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "126", "isCorrect": false},
          {"description": "206", "isCorrect": true},
          {"description": "215", "isCorrect": false},
          {"description": "200", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o maior planeta do sistema solar?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Marte", "isCorrect": false},
          {"description": "Saturno", "isCorrect": false},
          {"description": "Terra", "isCorrect": false},
          {"description": "Júpiter", "isCorrect": true}
        ]
      },
      {
        "description": "Um anel tem 3 pedras preciosas. Quantas pedras preciosas têm 11 anéis?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "33", "isCorrect": true},
          {"description": "333", "isCorrect": false},
          {"description": "30", "isCorrect": false},
          {"description": "13", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o planeta mais próximo do Sol?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Netuno", "isCorrect": false},
          {"description": "Mercúrio", "isCorrect": true},
          {"description": "Terra", "isCorrect": false},
          {"description": "Marte", "isCorrect": false}
        ]
      },
      {
        "description": "Quantos continentes existem?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "5", "isCorrect": false},
          {"description": "4", "isCorrect": false},
          {"description": "6", "isCorrect": true},
          {"description": "3", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a maior floresta tropical do mundo?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Mata Atlântica", "isCorrect": false},
          {"description": "Pampas", "isCorrect": false},
          {"description": "Pantanal", "isCorrect": false},
          {"description": "Floresta Amazônica", "isCorrect": true}
        ]
      },
      {
        "description": "Quais as duas línguas mais faladas no mundo?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Inglês e espanhol", "isCorrect": false},
          {"description": "Inglês e mandarim chinês", "isCorrect": true},
          {"description": "Mandarim chinês e francês", "isCorrect": false},
          {"description": "Inglês e português", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o monumento famoso pela sua inclinação?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Torre Eiffel", "isCorrect": false},
          {"description": "Esfinge", "isCorrect": false},
          {"description": "Cristo Redentor", "isCorrect": false},
          {"description": "Torre de Pisa", "isCorrect": true}
        ]
      },
      {
        "description": "Kryptonita é a fraqueza de qual super-herói?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Batman", "isCorrect": false},
          {"description": "Hulk", "isCorrect": false},
          {"description": "Super-Homem", "isCorrect": true},
          {"description": "Flash", "isCorrect": false}
        ]
      },
      {
        "description": "Quem pintou Mona Lisa?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Leonardo da Vinci", "isCorrect": true},
          {"description": "Salvador Dalí", "isCorrect": false},
          {"description": "Van Gogh", "isCorrect": false},
          {"description": "Pablo Picasso", "isCorrect": false}
        ]
      },
      {
        "description": "O que representam os cinco anéis olímpicos?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "As partes do mundo unidas pelo Olimpismo.", "isCorrect": true},
          {"description": "As argolas da ginástica artística.", "isCorrect": false},
          {"description": "Cinco deuses do Olimpo: Zeus, Atena, Apolo, Dionísio e Hermes.", "isCorrect": false},
          {"description": "Os símbolos olímpicos: tocha, hino, mascote, lema e medalhas.", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a personagem mais famosa de Maurício de Sousa?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Mafalda", "isCorrect": false},
          {"description": "Mônica", "isCorrect": true},
          {"description": "Magali", "isCorrect": false},
          {"description": "Menino Maluquinho", "isCorrect": false}
        ]
      },
      {
        "description": "Que cidade brasileira é conhecida por chover todos os dias quase à mesma hora?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Joinville", "isCorrect": false},
          {"description": "Belém", "isCorrect": true},
          {"description": "Natal", "isCorrect": false},
          {"description": "Rio de Janeiro", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o nome popular do cloreto de sódio?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Vinagre", "isCorrect": false},
          {"description": "Água", "isCorrect": false},
          {"description": "Papel", "isCorrect": false},
          {"description": "Sal de cozinha", "isCorrect": true}
        ]
      },
      {
        "description": "Que animal põe o maior ovo?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Avestruz", "isCorrect": true},
          {"description": "Tartaruga-gigante", "isCorrect": false},
          {"description": "Galinha", "isCorrect": false},
          {"description": "Pavão", "isCorrect": false}
        ]
      },
      {
        "description": "O que os pandas comem?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Bambu", "isCorrect": true},
          {"description": "Aves, ovos e peixe", "isCorrect": false},
          {"description": "Frutas e mel", "isCorrect": false},
          {"description": "Mel", "isCorrect": false}
        ]
      },
      {
        "description": "Quantos andares tem o maior prédio do mundo?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "100", "isCorrect": false},
          {"description": "200", "isCorrect": false},
          {"description": "163", "isCorrect": true},
          {"description": "50", "isCorrect": false}
        ]
      },
      {
        "description": "Em que país foi construído o Muro de Berlim?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Estados Unidos", "isCorrect": false},
          {"description": "China", "isCorrect": false},
          {"description": "Alemanha", "isCorrect": true},
          {"description": "Brasil", "isCorrect": false}
        ]
      },
      {
        "description": "Em que ano foi usado um celular pela primeira vez no Brasil?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "1993", "isCorrect": false},
          {"description": "1990", "isCorrect": true},
          {"description": "1995", "isCorrect": false},
          {"description": "1988", "isCorrect": false}
        ]
      },
      {
        "description": "Em que país se anda mais de bicicleta?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Portugal", "isCorrect": false},
          {"description": "Estados Unidos", "isCorrect": false},
          {"description": "Países Baixos", "isCorrect": true},
          {"description": "França", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a especialidade do otorrinolaringologista?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Tratamento das doenças bucais.", "isCorrect": false},
          {"description": "Tratamento das doenças nasais.", "isCorrect": false},
          {"description": "Tratamento das doenças dos olhos.", "isCorrect": false},
          {"description": "Tratamento das doenças relacionadas a nariz, ouvido e garganta.", "isCorrect": true}
        ]
      },
      {
        "description": "Qual a nacionalidade de Napoleão Bonaparte?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Francesa", "isCorrect": true},
          {"description": "Espanhola", "isCorrect": false},
          {"description": "Português", "isCorrect": false},
          {"description": "Italiano", "isCorrect": false}
        ]
      },
      {
        "description": "Depois do futebol, qual o esporte mais popular no Brasil?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Handebol", "isCorrect": false},
          {"description": "Vôlei", "isCorrect": true},
          {"description": "Basquete no gelo", "isCorrect": false},
          {"description": "Esgrima", "isCorrect": false}
        ]
      },
      {
        "description": "Que grande evento histórico aconteceu em 1822 no Brasil?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Descobrimento do Brasil", "isCorrect": false},
          {"description": "Revolução de 1930", "isCorrect": false},
          {"description": "Independência do Brasil", "isCorrect": true},
          {"description": "Construção de Brasília", "isCorrect": false}
        ]
      },
      {
        "description": "O que comemora no feriado do dia 21 de abril no Brasil?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Tiradentes", "isCorrect": true},
          {"description": "Independência do Brasil", "isCorrect": false},
          {"description": "Finados", "isCorrect": false},
          {"description": "Nossa Senhora Aparecida", "isCorrect": false}
        ]
      },
      {
        "description": "Em que conto de fadas uma princesa adormece com um feitiço e só acorda com o beijo de um príncipe?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "A Bela Adormecida", "isCorrect": true},
          {"description": "João e Maria", "isCorrect": false},
          {"description": "Chapeuzinho Vermelho", "isCorrect": false},
          {"description": "Os três porquinhos", "isCorrect": false}
        ]
      },
      {
        "description": "Em que região se localiza o estado de Minas Gerais?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Sudeste", "isCorrect": true},
          {"description": "Centro-Oeste", "isCorrect": false},
          {"description": "Sul", "isCorrect": false},
          {"description": "Nordeste", "isCorrect": false}
        ]
      },
      {
        "description": "Que fruto nasce da oliveira?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Amêndoa", "isCorrect": false},
          {"description": "Abacate", "isCorrect": false},
          {"description": "Azeitona", "isCorrect": true},
          {"description": "Oliva", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o plural de chapéu?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Chapéis", "isCorrect": false},
          {"description": "Chapéus", "isCorrect": true},
          {"description": "Chapéuzes", "isCorrect": false},
          {"description": "Os chapéu", "isCorrect": false}
        ]
      },
      {
        "description": "Quem escreveu Os Lusíadas?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Carlos Drummond de Andrade", "isCorrect": false},
          {"description": "Fernando Pessoa", "isCorrect": false},
          {"description": "Jorge Amado", "isCorrect": false},
          {"description": "Luís Vaz de Camões", "isCorrect": true}
        ]
      },
      {
        "description": "Barack Obama foi presidente de que país?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Estados Unidos da América", "isCorrect": true},
          {"description": "Inglaterra", "isCorrect": false},
          {"description": "Rússia", "isCorrect": false},
          {"description": "África do Sul", "isCorrect": false}
        ]
      },
      {
        "description": "Em que país de localiza o Taj Mahal?",
        "image": "paris.jpg",
        "difficulty": "média",
        "answers": [
          {"description": "Egito", "isCorrect": false},
          {"description": "Índia", "isCorrect": true},
          {"description": "Inglaterra", "isCorrect": false},
          {"description": "França", "isCorrect": false}
        ]
      },
      {
        "description": "Que navio famoso naufragou na sua viagem inaugural?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Titanic", "isCorrect": true},
          {"description": "Antonov", "isCorrect": false},
          {"description": "Airbus", "isCorrect": false},
          {"description": "Symphony of the Seas", "isCorrect": false}
        ]
      },
      {
        "description": "Qual o satélite natural da Terra?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "SCD-1", "isCorrect": false},
          {"description": "Amazonia 1", "isCorrect": false},
          {"description": "Ganimedes", "isCorrect": false},
          {"description": "Lua", "isCorrect": true}
        ]
      },
      {
        "description": "O que é um tsunami?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Um tornado", "isCorrect": false},
          {"description": "Um maremoto", "isCorrect": true},
          {"description": "Um terremoto", "isCorrect": false},
          {"description": "Um ciclone", "isCorrect": false}
        ]
      },
      {
        "description": "Qual destas substâncias faz parte da composição do vidro?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "Fibra", "isCorrect": false},
          {"description": "Celulose", "isCorrect": false},
          {"description": "Areia", "isCorrect": true},
          {"description": "Álcool", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a nacionalidade do sociólogo e filósofo Durkheim?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Alemã", "isCorrect": false},
          {"description": "Francesa", "isCorrect": true},
          {"description": "Inglesa", "isCorrect": false},
          {"description": "Norueguesa", "isCorrect": false}
        ]
      },
      {
        "description": "Lady Di era o apelido de qual personalidade?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Joana d’Arc", "isCorrect": false},
          {"description": "Carlota Joaquina", "isCorrect": false},
          {"description": "Diana, a Princesa de Gales", "isCorrect": true},
          {"description": "Grace Kelly", "isCorrect": false}
        ]
      },
      {
        "description": "Qual a primeira mulher a ganhar um prêmio Nobel?",
        "image": "paris.jpg",
        "difficulty": "difícil",
        "answers": [
          {"description": "Elizabeth Blackweel", "isCorrect": false},
          {"description": "Irène Joliot-Curie", "isCorrect": false},
          {"description": "Valentina Tereshkova", "isCorrect": false},
          {"description": "Marie Curie", "isCorrect": true}
        ]
      },
      {
        "description": "Quais as respectivas cores da reciclagem do papel, do vidro, do metal e do plástico?",
        "image": "paris.jpg",
        "difficulty": "fácil",
        "answers": [
          {"description": "azul, verde, amarelo e vermelho", "isCorrect": true},
          {"description": "verde, azul, vermelho e amarelo", "isCorrect": false},
          {"description": "azul, amarelo, verde e vermelho", "isCorrect": false},
          {"description": "verde, amarelo, azul e vermelho", "isCorrect": false}
        ]
      }
    ]
"""
package com.example.projeto2_somativa

// Função para simular um arquivo JSON
fun feed(): String = """
    [
      {
        "description": "Qual é a capital da França?",
        "image": "https://www.cp4.com.br/wp-content/uploads/2019/02/Paris.jpg",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAxNSReb5sXTu-yHchPtW3tUJi088QOI5_mA&s",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4PMiQXzLlGNBttRa-dsicfzKMYGFyxQfesA&s",
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
        "image": "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/08/49598_FB709B6C2250A9FB-1.jpg?w=1220&h=674&crop=1",
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
        "image": "https://www.melhoresdestinos.com.br/wp-content/uploads/2019/09/mapa-mundi-capa2019-01-820x430.jpg",
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
        "image": "https://www.estadao.com.br/recomenda/wp-content/uploads/2023/04/DaBmJ0Vml9o0Aym2hMCUmN1DMmXAV1-metaY2FwYWEuanBn-.jpg",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLHtJwg6fE9c5fWvWklSN2P9OzpSPiE5spfg&s",
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
        "image": "https://images.absolutdrinks.com/ingredient-images/Raw/Absolut/7f20cc5d-908d-4c47-a615-b7af7c792a0c.jpg?imwidth=500",
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
        "image": "https://img.odcdn.com.br/wp-content/uploads/2022/12/Fases-da-Lua.jpg",
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
        "image": "https://img.odcdn.com.br/wp-content/uploads/2023/08/ossos-humanos.jpg",
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
        "image": "https://static3.depositphotos.com/1010340/264/v/450/depositphotos_2646817-stock-illustration-solar-system.jpg",
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
        "image": "https://cdn.dooca.store/1115/products/20231025-1457252_495x495+fill_ffffff+crop_center.png?v=1699644149&webp=0",
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
        "image": "https://static3.depositphotos.com/1010340/264/v/450/depositphotos_2646817-stock-illustration-solar-system.jpg",
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
        "image": "https://www.melhoresdestinos.com.br/wp-content/uploads/2019/09/mapa-mundi-capa2019-01-820x430.jpg",
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
        "image": "https://h2ahubagroambiental.com.br/wp-content/uploads/2023/11/pinheiros-lindos-nas-montanhas-1.jpg",
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
        "image": "https://i0.wp.com/wp.ufpel.edu.br/tesouro-linguistico/files/2021/02/Imagem1.png?resize=385%2C225&ssl=1",
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
        "image": "https://images.unsplash.com/photo-1543429776-2782fc8e1acd?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dG9ycmUlMjBkZSUyMHBpc2F8ZW58MHx8MHx8fDA%3D",
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
        "image": "https://media.licdn.com/dms/image/C4D12AQGheQ7x7lBqig/article-cover_image-shrink_600_2000/0/1626192561645?e=2147483647&v=beta&t=EGOPNjrjbqk51OwKTwEO7635h6sBfCGlvxWJcUWsa0c",
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
        "image": "https://s2.glbimg.com/NtXCKmfb_1-IrhR8R9GF8nU5CaA=/smart/e.glbimg.com/og/ed/f/original/2014/05/10/mona_lisa_3d_01.jpg",
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
        "image": "https://s5.static.brasilescola.uol.com.br/img/2016/05/aneis_olimpicos.jpg",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwlbJOg41am04R_tt-LCFndocZVf0ZNRlEqQ&s",
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
        "image": "https://cdn.oantagonista.com/uploads/2024/03/Captura-de-Tela-2024-03-07-as-09.54.15.png",
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
        "image": "https://static.preparaenem.com/conteudo_legenda/5726d1e794d55a47a2f6c77893dbcd8e.jpg",
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
        "image": "https://media.gazetadopovo.com.br/2013/03/ovo_gigante030351-1.0.111428269-gpMedium.jpg",
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
        "image": "https://s4.static.brasilescola.uol.com.br/img/2019/09/panda.jpg",
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
        "image": "https://www.rbsdirect.com.br/imagesrc/17814666.jpg?w=700",
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
        "image": "https://media.vaticannews.va/media/content/dam-archive/vaticannews/multimedia/2019/08/13/2%20la%20costruzione%20del%20muro%20di%20Berlino%2013%20%20agosto%201961.jpg/_jcr_content/renditions/cq5dam.thumbnail.cropped.750.422.jpeg",
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
        "image": "https://t2.tudocdn.net/99964?w=1200&h=1200",
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
        "image": "https://i0.wp.com/oeco.org.br/wp-content/uploads/2019/07/bike3.jpg?fit=1152%2C768&ssl=1",
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
        "image": "https://jornaldomedico.com.br/wp-content/uploads/medico-duvida-1200x600-1-1024x512.jpg",
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
        "image": "https://static.todamateria.com.br/upload/na/po/napoleon_bonaparte_based_on_bb.jpg",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWSJXlBHuuq5LZwgQJbfSw5EfpG5hIov_sIw&s",
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
        "image": "https://static.todamateria.com.br/upload/in/de/independencia-do-brasil-og.jpg",
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
        "image": "https://img.freepik.com/vetores-gratis/modelo-de-calendario-anual-desenhado-a-mao_23-2149717488.jpg?size=626&ext=jpg&ga=GA1.1.672697106.1717200000&semt=ais_user",
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
        "image": "https://ogimg.infoglobo.com.br/in/17359872-e8e-ce6/FT1086A/20120316135804897rts.jpg",
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
        "image": "https://s4.static.brasilescola.uol.com.br/exercicios/2022/11/mapa-brasil.jpg",
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
        "image": "https://cdn.awsli.com.br/800x800/1334/1334796/produto/159294534/57485a2847.jpg",
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
        "image": "https://img.elo7.com.br/product/600x380/47DAE45/porta-chapeu-em-macrame-cabideiro-parede-para-3-chapeus-cabideiro-de-parede-para-chapeu.jpg",
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
        "image": "https://www.artesliberais.com.br/wp-content/uploads/2018/11/maxresdefault.jpg",
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
        "image": "https://ichef.bbci.co.uk/ace/ws/640/cpsprodpb/28FD/production/_116839401_gettyimages-467354336.jpg",
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
        "image": "https://static.mundoeducacao.uol.com.br/mundoeducacao/2022/11/vista-do-taj-mahal.jpg",
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
        "image": "https://www.wilsonsons.com.br/wp-content/uploads/2019/08/original-da63bea26bf2c1c2f40658631fddbad9-1024x683.jpg",
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
        "image": "https://img.freepik.com/fotos-gratis/terra-vista-do-espaco_23-2150528635.jpg?size=626&ext=jpg&ga=GA1.1.1968647580.1668789779&semt=sph",
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
        "image": "https://www.surfertoday.com/images/stories/tsunami-wave.jpg",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5QcgcfUljdyNgY2_DS9WARZKxGfTkkOhd0A&s",
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
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNsrsMDaF3zXZuRt0pHf0qHzwdKUCtp7DHRA&s",
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
        "image": "https://portalpopline.com.br/wp-content/uploads/2023/07/lady-gaga-quis-ser-chamada-lee-jpg.webp",
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
        "image": "https://i.natgeofe.com/k/a83cc938-b85a-4e5e-8b16-ff129f46c5f9/curie-lab_3x2.jpg",
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
        "image": "https://www.cursosabeline.com.br/webroot/cur_cursos/curso-com-certificado-de-reciclagem-1567021998.jpg",
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
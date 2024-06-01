package com.example.projeto2_somativa

// Função para simular um arquivo JSON
fun feed(): String = """
    [
      {
        "description": "Qual é a capital da França?",
        "image": "paris.jpg",
        "difficulty": "baixa",
        "answers": [
          {"description": "Londres", "isCorrect": false},
          {"description": "Paris", "isCorrect": true},
          {"description": "Berlim", "isCorrect": false},
          {"description": "Madrid", "isCorrect": false}
        ]
      }
    ]
    """
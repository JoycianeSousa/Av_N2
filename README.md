# 📐 Figuras Geométricas Planas

Este projeto tem como objetivo apresentar as principais figuras geométricas planas, suas fórmulas de área e perímetro, além de permitir que o usuário realize os cálculos de forma prática usando Python.

## ✏️ O que são figuras planas?

Figuras planas são formas geométricas que possuem **duas dimensões**: **altura** e **largura**. Elas estão presentes no nosso dia a dia e são estudadas na geometria plana.

---

## 📊 Figuras e Fórmulas

### 🔺 Triângulo
- **Descrição**: Polígono com 3 lados.
- **Área**: (base × altura) / 2  
- **Perímetro**: soma dos três lados

### ◼️ Quadrado
- **Descrição**: Todos os lados e ângulos são iguais.
- **Área**: lado²  
- **Perímetro**: 4 × lado

### ▭ Retângulo
- **Descrição**: Tem lados opostos iguais e ângulos retos.
- **Área**: base × altura  
- **Perímetro**: 2 × (base + altura)

### ⚪ Círculo
- **Descrição**: Figura curva, com todos os pontos à mesma distância do centro.
- **Área**: π × raio²  
- **Perímetro (circunferência)**: 2 × π × raio

### 🔷 Losango
- **Descrição**: Todos os lados são iguais e tem duas diagonais.
- **Área**: (diagonal maior × diagonal menor) / 2  
- **Perímetro**: 4 × lado

### ▱ Paralelogramo
- **Descrição**: Lados opostos paralelos e iguais.
- **Área**: base × altura  
- **Perímetro**: 2 × (base + lado)

### 🔻 Trapézio
- **Descrição**: Possui duas bases paralelas.
- **Área**: ((base maior + base menor) × altura) / 2  
- **Perímetro**: soma dos 4 lados

### ⬟ Pentágono Regular
- **Descrição**: Polígono com 5 lados iguais.
- **Área**: (5 × lado²) / (4 × tan(π/5))  
- **Perímetro**: 5 × lado

### ⬢ Hexágono Regular
- **Descrição**: Polígono com 6 lados iguais.
- **Área**: (3 × √3 × lado²) / 2  
- **Perímetro**: 6 × lado

.

# 📦 Formas Geométricas Espaciais
## ✨ O que são Figuras Geométricas Espaciais? 

Figuras geométricas espaciais são sólidos que possuem três dimensões: altura, largura e comprimento. Elas ocupam espaço e, por isso, possuem volume e área total, ao contrário das figuras planas que possuem apenas perímetro e área.




### 🔷 Formas Geométricas Espaciais Presentes no Projeto

#### 📦 Cubo
- Descrição: Sólido com 6 faces quadradas congruentes.
- Área Total: Seis vezes a área de uma face.
- Volume: Aresta elevada ao cubo.

#### 🧱 Paralelepípedo
- Descrição: Sólido com 6 faces retangulares.
- Área Total: Soma de duas vezes cada combinação dos produtos entre comprimento, largura e altura.
- Volume: Produto do comprimento, largura e altura.

#### 🔺 Pirâmide (base quadrada)
- Descrição: Sólido com uma base quadrada e quatro faces laterais triangulares.
- Área Total: Soma da área da base com a área lateral.
- Volume: Produto da área da base pela altura, dividido por três.

#### 🏀 Esfera
- Descrição: Sólido perfeitamente redondo, onde todos os pontos da superfície estão à mesma distância do centro.
- Área Total: Quatro vezes pi vezes o raio ao quadrado.
- Volume: Quatro terços de pi vezes o raio elevado ao cubo.

#### 🥫 Cilindro
- Descrição: Sólido com duas bases circulares paralelas e uma superfície lateral curva.
- Área Total: Duas vezes pi vezes o raio vezes a soma do raio com a altura.
- Volume: Pi vezes o raio ao quadrado vezes a altura.

#### 🔺 Cone
- Descrição: Sólido com uma base circular e uma superfície lateral que converge para um vértice.
- Área Total: Pi vezes o raio vezes a soma do raio com a geratriz.
- Volume: Um terço de pi vezes o raio ao quadrado vezes a altura.

#### 🏢 Prisma (base poligonal regular)
- Descrição: Sólido com duas bases paralelas e congruentes, ligadas por faces laterais que são paralelogramos.
- Área Total: Soma de duas vezes a área da base com o produto do perímetro da base pela altura.
- Volume: Área da base multiplicada pela altura.

#### 🔺 Tetraedro Regular
- Descrição: Sólido com quatro faces triangulares equiláteras, seis arestas e quatro vértices.
- Área Total: Aresta ao quadrado multiplicada pela raiz quadrada de três.
- Volume: Aresta elevada ao cubo multiplicada pela raiz quadrada de dois, dividido por doze.

## Diagrama UML Abstração:
![Image](https://github.com/user-attachments/assets/ef635f2a-7eac-4531-9666-6116f08123ff)

# ⛓️Figuras Geometricas – Encapsulamento 
Este projeto demonstra o conceito de encapsulamento, um dos pilares da Programação Orientada a Objetos (POO). Ele garante que os dados das figuras geométricas estejam protegidos, permitindo acesso e modificação apenas através de métodos públicos controlados.

### 🧩 Organização dos Pacotes
br.edu.principal
Contém a classe principal responsável por executar os testes com as figuras.

br.edu.figurasgeometricasplanas
Contém as classes que implementam formas planas com seus atributos privados e métodos de acesso (getters e setters).

##  Diagrama de classe UML com Encapsulamento: 
![Image](https://github.com/user-attachments/assets/67e8093d-4134-48cb-acac-96ee56244a8c)

#  ⛓️Figuras Geometricas – Herança 
Este projeto demonstra o uso do princípio de herança, um dos pilares da Programação Orientada a Objetos (POO). Por meio da herança, classes específicas de figuras reutilizam atributos e métodos de uma estrutura base, promovendo reaproveitamento de código e organização hierárquica.

### 🧩 Organização dos Pacotes
br.edu.principal
Contém a classe principal responsável por executar o programa e testar as figuras.

br.edu.figurasgeometricasplanas
Inclui uma classe abstrata base para formas planas e suas subclasses concretas (como Quadrado, Triangulo, Circulo).

br.edu.figurasgeometricasespaciais
Contém uma estrutura semelhante, com herança aplicada para sólidos como Cubo, Esfera, Cilindro.

## Diagrma de classe UML com Herança: 
![Image](https://github.com/user-attachments/assets/1e5863fe-6130-4094-af0c-be03bae40b92)

  👤 Autor
Desenvolvido por:

<img src="https://avatars.githubusercontent.com/u/201272778?v=4" height="100" alt="Foto de perfil do autor" style="border-radius: 50%">

**_Joyciane Sousa_**

Meu Usuario: [GitHub](https://github.com/JoycianeSousa)

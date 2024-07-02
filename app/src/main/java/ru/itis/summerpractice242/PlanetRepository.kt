package ru.itis.summerpractice242

object PlanetRepository {
    val planets: List<Planet> = listOf(

        Planet(
            id = 0,
            name = "Меркурий",
            info = "земная группа",
            url = "http://vohuman.ru/images/stories/Jyotish/merkuriy.jpg"),

        Planet(
            id = 1,
            name = "Венера",
            info = "земная группа",
            url = "https://bogatyr.club/uploads/posts/2023-06/1686989202_bogatyr-club-p-venera-na-chernom-fone-vkontakte-6.jpg"),

        Planet(
            id = 2,
            name = "Земля",
            info = "земная группа",
            url = "https://klike.net/uploads/posts/2022-08/1661928839_j-17.jpg"),
        Planet(
            id = 3,
            name = "Марс",
            info = "земная группа",
            url = "https://klike.net/uploads/posts/2023-01/1674455119_3-161.jpg"),

        Planet(
            id = 4,
            name = "Юпитер",
            info = "газовый гигант",
            url = "https://new-science.ru/wp-content/uploads/2020/12/52852-11.jpg"),

        Planet(
            id = 5,
            name = "Сатурн",
            info = "газовый гигант",
            url = "https://i.pinimg.com/originals/ce/65/b7/ce65b78e6adb9e0a6126c902a9d078f1.jpg"),

        Planet(
            id = 6,
            name = "Уран",
            info = "газовый гигант",
            url = "https://astra-nsk.com/wp-content/uploads/2014/01/uranus.jpg")
    )
}
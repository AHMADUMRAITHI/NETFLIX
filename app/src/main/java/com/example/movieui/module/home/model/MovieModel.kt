package com.example.movieui.module.home.model

import com.example.movieui.R

data class MovieModel(
    val id:String,
    val title: String,
    val assetImage: Int,
    val type: String,
    val duration: String,
    val rating: String,
    val synopsis: String,
    val isPlaying: Boolean
)


val nowPlayingMovie = listOf(
    MovieModel(
        id= "1",
        title = "Peaky Blinders",
        assetImage = R.drawable.peaky,
        type = "Action",
        duration = "1h 20m",
        rating = "10/10",
        synopsis = "British crime drama series that focuses on the Shelby crime family that reigned supreme in post-World War I Birmingham. The story begins in 1919, when Thomas \"Tommy\" Shelby, a smart but ambitious war veteran, leads the Shelby family and their notorious gang. with the name \"Peaky Blinders\"—a name derived from their habit of hiding knives in the brim of their hats. Tommy is determined to turn his family, which was once involved in low-level criminal activity, into an influential force in the world of business and politics.",
        isPlaying = true
    ),
    MovieModel(
        id= "2",
        title = "Money Heist",
        assetImage = R.drawable.money,
        type = "Action",
        duration = "1h 59m",
        rating = "10/10",
        synopsis = "Spanish series that follows the story of a group of robbers who commit the largest heist in Spanish history. The story begins when a mysterious man known as \"The Professor\" recruits eight people with special abilities to carry out his extraordinary plan: print billions of euros by breaking into the Royal Mint of Spain. Each member of the team used a city name—Tokyo, Berlin, Nairobi, Rio, Denver, Moscow, Helsinki, and Oslo—to keep their identities anonymous.",
        isPlaying = true
    ),
    MovieModel(
        id= "3",
        title = "Fast And Furious X",
        assetImage = R.drawable.fast,
        type = "Action",
        duration = "2h 21m",
        rating = "10/10",
        synopsis = "The film Fast X or Fast and Furious 10 continues the action story of Dominic Toretto's family in facing new enemies full of revenge. This film reveals Dom's (Vin Diesel) past when he has to face Dante Reyes (Jason Momoa), the son of Hernan Reyes, who was their enemy in the film Fast Five. Dante plans revenge on Dom and his family for the death of his father and the loss of their fortune.",
        isPlaying = true
    ),
    MovieModel(
        id= "4",
        title = "Venom Let There Be Carnage",
        assetImage = R.drawable.venom,
        type = "Action",
        duration = "2h 21m",
        rating = "9.5/10",
        synopsis = "sequel to the film Venom (2018) which continues the story of Eddie Brock (Tom Hardy) and the alien symbiote Venom that lives in his body. This film focuses on the unique relationship between Eddie and Venom, who try to live side by side even though they often experience disagreements. Eddie tries to rebuild his career as a journalist, while Venom has a great desire to more freely express his aggressive and violent side.",
        isPlaying = true
    ),
    MovieModel(
        id= "5",
        title = "Thor: Love and Thunder",
        assetImage = R.drawable.thor,
        type = "Action",
        duration = "2h 40m",
        rating = "7.0/10",
        synopsis = "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher's vengeance and stop him before it's too late.",
        isPlaying = true
    ),
    MovieModel(
        id= "6",
        title = "Spiderman No Way Home",
        assetImage = R.drawable.spiderman,
        type = "Action",
        duration = "2h 20m",
        rating = "8.5/10",
        synopsis = "No Way Home is a superhero film that follows Peter Parker’s struggle after his secret identity as Spider-Man is revealed to the world. The story picks up after Spider-Man: Far From Home, where Peter faces media frenzy, public scrutiny, and legal challenges, affecting not only his own life but also the lives of his loved ones—MJ, Aunt May, and Ned.",
        isPlaying = true
    ),
    MovieModel(
        id= "7",
        title = "Transformers Rise Of The Beasts",
        assetImage = R.drawable.trans,
        type = "Action",
        duration = "2h 43m",
        rating = "9.0/10",
        synopsis = "Rise of the Beasts is a sci-fi action film that continues the Transformers saga, introducing new factions of robotic beings—the Maximals, Predacons, and Terrorcons. Set in 1994, the story follows main characters Noah Diaz, a former soldier from Brooklyn, and Elena Wallace, an artifact researcher, who unexpectedly get drawn into a conflict between the Autobots and a new, even more dangerous enemy.",
        isPlaying = true
    ),
    MovieModel(
        id= "8",
        title = "Queens Gambit",
        assetImage = R.drawable.queens,
        type = "History",
        duration = "1h 50m",
        rating = "8.5/10",
        synopsis = "This series tells the story of Beth Harmon, an orphan who discovers her talent for playing chess at an orphanage in the 1960s. Beth, who is introverted and shy, begins to find her confidence through playing chess. He grew into an intelligent, disciplined and strong-willed teenager. Beth managed to become the youngest participant in the U.S Open Championship at the age of 16.",
        isPlaying = true
    ),
    MovieModel(
        id= "9",
        title = "Batman The Dark Knight",
        assetImage = R.drawable.batman,
        type = "Action",
        duration = "2h 40m",
        rating = "8.5/10",
        synopsis = "The Dark Knight (often referred to as Batman II in Christopher Nolan’s trilogy) is a critically acclaimed superhero film that continues the story of Bruce Wayne as Batman, Gotham City’s vigilante protector. The film delves into Batman's complex battle against a new and terrifying villain, the Joker, who emerges as a chaotic force determined to bring Gotham to its knees through fear and anarchy.",
        isPlaying = true
    ),
    MovieModel(
        id= "10",
        title = "Black Panther Wakanda Forever",
        assetImage = R.drawable.black,
        type = "Action",
        duration = "2h 50m",
        rating = "8.5/10",
        synopsis = "Wakanda Forever is the sequel to Black Panther, set in the Marvel Cinematic Universe. The film focuses on the people of Wakanda as they mourn the loss of King T’Challa (in tribute to the late Chadwick Boseman) and face new challenges that threaten their nation’s safety and sovereignty With Wakanda vulnerable after the loss of its king, Queen Ramonda, Shuri, M’Baku, Okoye, and the Dora Milaje must rally to protect their home from outside forces and a mysterious underwater kingdom led by Namor, the Sub-Mariner.",
        isPlaying = true
    ),
)

val upcoming = listOf(
    MovieModel(
        id= "11",
        title = "RED ONE",
        assetImage = R.drawable.red,
        type = "Action",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "action-packed holiday movie that brings a unique twist to Christmas adventures. Starring Dwayne Johnson and Chris Evans, the film combines elements of action, comedy, and holiday magic, taking audiences on an epic, globe-trotting mission with Santa Claus and his team.",
        isPlaying = false
    ),
    MovieModel(
        id= "12",
        title = "Minions: ILLUMINATION",
        assetImage = R.drawable.ilumination,
        type = "Animation",
        duration = "1h 50m",
        rating = "N/A",
        synopsis = "animated comedy film produced by Illumination Entertainment that focuses on the Minions, the small yellow creatures made famous by the Despicable Me films. This movie serves as a prequel, exploring the origins of the Minions and their adventures before meeting Gru.",
        isPlaying = false
    ),
    MovieModel(
        id= "13",
        title = "Stephen King's IT",
        assetImage = R.drawable.it,
        type = "Horror",
        duration = "2h 27m",
        rating = "N/A",
        synopsis = "It is a horror film adapted from Stephen King’s novel of the same name. The story follows a group of kids who call themselves \"The Losers’ Club\" in the small town of Derry, Maine. These children face the terror of a malevolent creature that takes the form of a clown named Pennywise, who appears every 27 years to terrorize and prey on the children of the town.",
        isPlaying = false
    ),
    MovieModel(
        id= "14",
        title = "Breaking Bad",
        assetImage = R.drawable.breaking,
        type = "Action",
        duration = "2h 20m",
        rating = "N/A",
        synopsis = "Breaking Bad is a critically acclaimed American TV series created by Vince Gilligan. The story follows Walter White, a struggling high school chemistry teacher diagnosed with terminal lung cancer. Faced with the reality of leaving his family in financial hardship, he decides to start manufacturing and selling methamphetamine to secure their future.",
        isPlaying = false
    ),
    MovieModel(
        id= "15",
        title = "DARK",
        assetImage = R.drawable.dark,
        type = "Adventure",
        duration = "2h 40m",
        rating = "N/A",
        synopsis = "Dark is a German science fiction thriller series created by Baran bo Odar and Jantje Friese, which dives into the mystery of time travel, family secrets, and the dark forces that affect a small German town called Winden. The story begins with the disappearance of a teenager, Erik, followed shortly by the mysterious vanishing of a boy named Mikkel.",
        isPlaying = false
    ),
    MovieModel(
        id= "16",
        title = "Crime Stories",
        assetImage = R.drawable.crime,
        type = "Action",
        duration = "2h 15m",
        rating = "N/A",
        synopsis = "The Indian Detective is a Canadian-Indian crime-comedy series starring Russell Peters as Doug D’Mello, a Toronto police officer of Indian descent who finds himself unexpectedly involved in a criminal investigation while on vacation in Mumbai. Doug is a by-the-book cop, but his career isn’t going as planned—he’s stuck in a rut, still trying to prove himself as a capable detective back in Canada.",
        isPlaying = false
    ),
    MovieModel(
        id= "17",
        title = "Stranger Things I",
        assetImage = R.drawable.stranger1,
        type = "Horror",
        duration = "2h 22m",
        rating = "N/A",
        synopsis = "Stranger Things is a popular American science fiction horror series created by the Duffer Brothers. Set in the 1980s in the small town of Hawkins, Indiana, the story begins with the mysterious disappearance of a young boy named Will Byers. As his friends and family search for him, they uncover strange and terrifying occurrences connected to a secret government experiment and a parallel dimension known as the \"Upside Down.\"",
        isPlaying = false
    ),
    MovieModel(
        id= "18",
        title = "Nope",
        assetImage = R.drawable.nope,
        type = "Science Fiction",
        duration = "2h 11m",
        rating = "N/A",
        synopsis = "Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery.",
        isPlaying = false
    ),
    MovieModel(
        id= "19",
        title = "Thirteen Lives",
        assetImage = R.drawable.lives,
        type = "Drama",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "A dramatization of the rescue of a boys soccer team from an underground cave in Thailand.",
        isPlaying = false
    ),
    MovieModel(
        id= "20",
        title = "DC League of Super-Pets",
        assetImage = R.drawable.super_pets,
        type = "Animation",
        duration = "1h 46m",
        rating = "N/A",
        synopsis = "When Superman and the rest of the Justice League are kidnapped, Krypto the Super-Dog must convince a rag-tag shelter pack - Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel - to master their own newfound powers and help him rescue the superheroes.",
        isPlaying = false
    ),
)


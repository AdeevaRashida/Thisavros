package com.adeeva.chores.booksapp.data

import com.adeeva.chores.booksapp.R

object BookDataObject {

    private val bookTitle = arrayOf(
        "Hamnet",
        "Refugee",
        "Diary of a Wimpy Kid",
        "Harry Potter and the Philosopher's Stone",
        "The Last Cuentista",
        "Harry Potter and the Prisoner of Azkaban",
        "Percy Jackson: The Lightning Thief",
        "Ground Zero",
        "Harry Potter and the Half-Blood Prince",
        "A Little Life",
        "Heroes Of Olympus: The Lost Hero",
        "Harry Potter and the Deathly Hallows"
    )

    private val bookAuthor = arrayOf(
        "Maggie O'Farrell",
        "Alan Gratz",
        "Jeff Kinney",
        "J.K. Rowling",
        "Donna Barba Higuera",
        "J.K. Rowling",
        "Rick Riordan",
        "Alan Gratz",
        "J.K. Rowling",
        "Hanya Yanagihara",
        "Rick Riordan",
        "J.K. Rowling"
    )

    private val bookPrice = arrayOf(
        "$7.49 [Paperback]",
        "$9.74 [Hardcover]",
        "$14.99 [Hardcover]",
        "$7.19 [Paperback]",
        "$16.49 [Hardcover]",
        "$7.19 [Paperback]",
        "$7.99 [Paperback]",
        "$13.40 [Hardcover]",
        "$7.19 [Paperback]",
        "$12.32 [Paperback]",
        "$18.99 [Hardcover]",
        "$7.19 [Paperback]"
    )

    private val bookSummary = arrayOf(
        "Their mother, Agnes, is over a mile away, in the garden where she grows medicinal herbs. Their father is working in London. Neither parent knows that one of the children will not survive the week.\n" +
                "\n" +
                "Hamnet is a novel inspired by the son of a famous playwright. It is a story of the bond between twins, and of a marriage pushed to the brink by grief. It is also the story of a kestrel and its mistress; a flea that boards a ship in Alexandria; and a glovemaker's son who flouts convention in pursuit of the woman he loves. Above all, it is a tender and unforgettable reimagining of a boy whose life has been all but forgotten, but whose name was given to one of the most celebrated plays ever written.",

        "Three different kids.\n" +
                "\n" +
                "One mission in common: ESCAPE.\n" +
                "\n" +
                "Josef is a Jewish boy in 1930s Nazi Germany. With the threat of concentration camps looming, he and his family board a ship bound for the other side of the world…\n" +
                "\n" +
                "Isabel is a Cuban girl in 1994. With riots and unrest plaguing her country, she and her family set out on a raft, hoping to find safety and freedom in America…\n" +
                "\n" +
                "Mahmoud is a Syrian boy in 2015. With his homeland torn apart by violence and destruction, he and his family begin a long trek toward Europe…\n" +
                "\n" +
                "All three young people will go on harrowing journeys in search of refuge. All will face unimaginable dangers–from drownings to bombings to betrayals. But for each of them, there is always the hope of tomorrow. And although Josef, Isabel, and Mahmoud are separated by continents and decades, surprising connections will tie their stories together in the end.",

        "It’s a new school year, and Greg Heffley finds himself thrust into middle school, where undersized weaklings share the hallways with kids who are taller, meaner, and already shaving. The hazards of growing up before you’re ready are uniquely revealed through words and drawings as Greg records them in his diary.\n" +
                "In book one of this debut series, Greg is happy to have Rowley, his sidekick, along for the ride. But when Rowley’s star starts to rise, Greg tries to use his best friend’s newfound popularity to his own advantage, kicking off a chain of events that will test their friendship in hilarious fashion.",

        "Harry Potter has never even heard of Hogwarts when the letters start dropping on the doormat at number four, Privet Drive. Addressed in green ink on yellowish parchment with a purple seal, they are swiftly confiscated by his grisly aunt and uncle. Then, on Harry’s eleventh birthday, a great beetle-eyed giant of a man called Rubeus Hagrid bursts in with some astonishing news: Harry Potter is a wizard, and he has a place at Hogwarts School of Witchcraft and Wizardry. An incredible adventure is about to begin!",

        "There lived a girl named Petra Peña, who wanted nothing more than to be a storyteller, like her abuelita.\n" +
                "\n" +
                "But Petra's world is ending. Earth has been destroyed by a comet, and only a few hundred scientists and their children – among them Petra and her family – have been chosen to journey to a new planet. They are the ones who must carry on the human race.\n" +
                "\n" +
                "Hundreds of years later, Petra wakes to this new planet – and the discovery that she is the only person who remembers Earth. A sinister Collective has taken over the ship during its journey, bent on erasing the sins of humanity's past. They have systematically purged the memories of all aboard – or purged them altogether.\n" +
                "\n" +
                "Petra alone now carries the stories of our past, and with them, any hope for our future. Can she make them live again?",

        "When the Knight Bus crashes through the darkness and screeches to a halt in front of him, it’s the start of another far from ordinary year at Hogwarts for Harry Potter. Sirius Black, escaped mass-murderer and follower of Lord Voldemort, is on the run – and they say he is coming after Harry. In his first ever Divination class, Professor Trelawney sees an omen of death in Harry’s tea leaves... But perhaps most terrifying of all are the Dementors patrolling the school grounds, with their soul-sucking kiss.",

        "Twelve-year-old Percy Jackson is on the most dangerous quest of his life. With the help of a satyr and a daughter of Athena, Percy must journey across the United States to catch a thief who has stolen the original weapon of mass destruction — Zeus’ master bolt. Along the way, he must face a host of mythological enemies determined to stop him. Most of all, he must come to terms with a father he has never known, and an Oracle that has warned him of betrayal by a friend.",

        "Two kids. One devastating day.\n" +
                "\n" +
                "September 11, 2001. New York City. Nine year old Brandon goes to work with his dad on the 107th floor of the World Trade Center. Out of nowhere an airplane slams into the tower, creating a fiery nightmare of terror and confusion that threatens everyone in the building. Can Brandon survive–and escape?\n" +
                "\n" +
                "September 11, 2019. Afghanistan. Eleven year old Reshmina has grown up in the shadow of war, but she dreams of peace and progress. When a battle erupts in her village, Reshmina stumbles upon a wounded American soldier named Taz. Should she help him–and put herself and her family in mortal danger?\n" +
                "\n" +
                "In time for the 20th anniversary of 9/11, Ground Zero delivers a pulse-pounding and unforgettable take on history and hope, revenge and fear–and the stunning links between the past and present.",

        "When Dumbledore arrives at Privet Drive one summer night to collect Harry Potter, his wand hand is blackened and shrivelled, but he does not reveal why. Secrets and suspicion are spreading through the wizarding world, and Hogwarts itself is not safe. Harry is convinced that Malfoy bears the Dark Mark: there is a Death Eater amongst them. Harry will need powerful magic and true friends as he explores Voldemort’s darkest secrets, and Dumbledore prepares him to face his destiny.",

        "When four classmates from a small Massachusetts college move to New York to make their way, they're broke, adrift, and buoyed only by their friendship and ambition. There is kind, handsome Willem, an aspiring actor; JB, a quick-witted, sometimes cruel Brooklyn-born painter seeking entry to the art world; Malcolm, a frustrated architect at a prominent firm; and withdrawn, brilliant, enigmatic Jude, who serves as their center of gravity.\n" +
                "\n" +
                "Over the decades, their relationships deepen and darken, tinged by addiction, success, and pride. Yet their greatest challenge, each comes to realize, is Jude himself, by midlife a terrifyingly talented litigator yet an increasingly broken man, his mind and body scarred by an unspeakable childhood, and haunted by what he fears is a degree of trauma that he’ll not only be unable to overcome—but that will define his life forever.",

        "Jason has a problem. He doesn’t remember anything before waking up on a school bus holding hands with a girl. Apparently she’s his girlfriend Piper, his best friend is a kid named Leo, and they’re all students in the Wilderness School, a boarding school for “bad kids.” What he did to end up here, Jason has no idea—except that everything seems very wrong.\n" +
                "\n" +
                "Piper has a secret. Her father has been missing for three days, and her vivid nightmares reveal that he’s in terrible danger. Now her boyfriend doesn’t recognize her, and when a freak storm and strange creatures attack during a school field trip, she, Jason, and Leo are whisked away to someplace called Camp Half-Blood. What is going on?\n" +
                "\n" +
                "Leo has a way with tools. His new cabin at Camp Half-Blood is filled with them. Seriously, the place beats Wilderness School hands down, with its weapons training, monsters, and fine-looking girls. What’s troubling is the curse everyone keeps talking about, and that a camper’s gone missing. Weirdest of all, his bunkmates insist they are all—including Leo—related to a god.",

        "As he climbs into the sidecar of Hagrid’s motorbike and takes to the skies, leaving Privet Drive for the last time, Harry Potter knows that Lord Voldemort and the Death Eaters are not far behind. The protective charm that has kept Harry safe until now is broken, but he cannot keep hiding. The Dark Lord is breathing fear into everything Harry loves, and to stop him Harry will have to find and destroy the remaining Horcruxes. The final battle must begin – Harry must stand and face his enemy."
    )

    private val bookPhoto = intArrayOf(
        R.drawable.hamnet_1,
        R.drawable.refugee,
        R.drawable.diary_of_a_wimpy_kid,
        R.drawable.harry_1,
        R.drawable.the_last,
        R.drawable.harry_prisoner,
        R.drawable.percy_jack,
        R.drawable.ground_zero,
        R.drawable.harry_half,
        R.drawable.a_little_life,
        R.drawable.the_lost_hero,
        R.drawable.harry_deathly
    )

    val listData: ArrayList<BookData>
    get(){
        val list = arrayListOf<BookData>()
        for (position in bookAuthor.indices){
            val book = BookData()
            book.book_title = bookTitle[position]
            book.author = bookAuthor[position]
            book.price = bookPrice[position]
            book.summary = bookSummary[position]
            book.photo = bookPhoto[position]
            list.add(book)

        }
        return list
    }

}
data class EmojiItem(val id: Int, val englishName: String, val bengaliName: String, val soundResourceId: Int)

object EmojiDatabase {
    // Sample data with 20 emojis (10 animals and 10 objects)
    private val emojiList = listOf(
        EmojiItem(1, "Dog", "কুকুর", R.raw.dog_sound),
        EmojiItem(2, "Cat", "বিড়াল", R.raw.cat_sound),
        EmojiItem(3, "Elephant", "হাতি", R.raw.elephant_sound),
        EmojiItem(4, "Lion", "সিংহ", R.raw.lion_sound),
        EmojiItem(5, "Tiger", "বাঘ", R.raw.tiger_sound),
        EmojiItem(6, "Monkey", "বানর", R.raw.monkey_sound),
        EmojiItem(7, "Horse", "ঘোড়া", R.raw.horse_sound),
        EmojiItem(8, "Cow", "গরু", R.raw.cow_sound),
        EmojiItem(9, "Sheep", "ভেড়া", R.raw.sheep_sound),
        EmojiItem(10, "Fish", "মাছ", R.raw.fish_sound),
        EmojiItem(11, "Ball", "গेंद", R.raw.ball_sound),
        EmojiItem(12, "Car", "গাড়ি", R.raw.car_sound),
        EmojiItem(13, "Doll", "গোল্লা", R.raw.doll_sound),
        EmojiItem(14, "Book", "বই", R.raw.book_sound),
        EmojiItem(15, "Chair", "কুরসি", R.raw.chair_sound),
        EmojiItem(16, "Table", "টেবিল", R.raw.table_sound),
        EmojiItem(17, "Phone", "ফোন", R.raw.phone_sound),
        EmojiItem(18, "Clock", "ঘড়ি", R.raw.clock_sound),
        EmojiItem(19, "Teddy Bear", "টেডি বিয়ার", R.raw.teddy_bear_sound),
        EmojiItem(20, "Pencil", "পেনসিল", R.raw.pencil_sound)
    )

    fun getEmojiList(): List<EmojiItem> {
        return emojiList
    }

    fun getEmojisByCategory(category: String): List<EmojiItem> {
        return emojiList.filter { emoji -> 
            // This is a simple filter based on the category; you can refine this logic later
            emoji.englishName.equals(category, ignoreCase = true) || emoji.bengaliName.equals(category, ignoreCase = true) 
        }
    }

    fun getEmojiById(id: Int): EmojiItem? {
        return emojiList.find { it.id == id }
    }

    fun getRandomEmoji(): EmojiItem {
        return emojiList.random()
    }
}
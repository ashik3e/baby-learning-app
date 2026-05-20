package com.ashik3e.babylearning

data class EmojiItem(val id: Int, val englishName: String, val bengaliName: String, val soundResourceId: Int)

object EmojiDatabase {
    private val emojiList = listOf(
        EmojiItem(1, "🐶", "কুকুর", android.R.raw.composer),
        EmojiItem(2, "🐱", "বিড়াল", android.R.raw.composer),
        EmojiItem(3, "🐘", "হাতি", android.R.raw.composer),
        EmojiItem(4, "🦁", "সিংহ", android.R.raw.composer),
        EmojiItem(5, "🐯", "বাঘ", android.R.raw.composer),
        EmojiItem(6, "🐵", "বানর", android.R.raw.composer),
        EmojiItem(7, "🐴", "ঘোড়া", android.R.raw.composer),
        EmojiItem(8, "🐄", "গরু", android.R.raw.composer),
        EmojiItem(9, "🐑", "ভেড়া", android.R.raw.composer),
        EmojiItem(10, "🐟", "মাছ", android.R.raw.composer),
        EmojiItem(11, "⚽", "বল", android.R.raw.composer),
        EmojiItem(12, "🚗", "গাড়ি", android.R.raw.composer),
        EmojiItem(13, "🪀", "খেলনা", android.R.raw.composer),
        EmojiItem(14, "📖", "বই", android.R.raw.composer),
        EmojiItem(15, "🪑", "কুর্সি", android.R.raw.composer),
        EmojiItem(16, "🪟", "টেবিল", android.R.raw.composer),
        EmojiItem(17, "📱", "ফোন", android.R.raw.composer),
        EmojiItem(18, "⏰", "ঘড়ি", android.R.raw.composer),
        EmojiItem(19, "🧸", "টেডি বিয়ার", android.R.raw.composer),
        EmojiItem(20, "✏️", "পেনসিল", android.R.raw.composer)
    )

    fun getEmojiList(): List<EmojiItem> = emojiList
    fun getEmojiById(id: Int): EmojiItem? = emojiList.find { it.id == id }
    fun getRandomEmoji(): EmojiItem = emojiList.random()
}
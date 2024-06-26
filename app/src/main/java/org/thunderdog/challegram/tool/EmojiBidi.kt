@file:JvmName("EmojiBidUtil")

package org.thunderdog.challegram.tool

import me.vkryl.annotation.Autogenerated

const val MAX_LTR_EMOJI_LENGTH = 4

@Autogenerated private fun isKnownLtrEmoji (codePoint: Int, nextCodePoint: Int): Boolean = if ((codePoint in 0x1f1e6..0x1f1ff) && (nextCodePoint in 0x1f1e6..0x1f1ff)) {
  when (codePoint) {
    0x1f1e6 -> when (nextCodePoint) {
      in 0x1f1e8..0x1f1ec,
      0x1f1ee,
      0x1f1f1,
      0x1f1f2,
      0x1f1f4,
      in 0x1f1f6..0x1f1fa,
      0x1f1fc,
      0x1f1fd,
      0x1f1ff -> true
      else -> false
    }
    0x1f1e7 -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e7,
      in 0x1f1e9..0x1f1ef,
      in 0x1f1f1..0x1f1f4,
      in 0x1f1f6..0x1f1f9,
      0x1f1fb,
      0x1f1fc,
      0x1f1fe,
      0x1f1ff -> true
      else -> false
    }
    0x1f1e8 -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e8,
      0x1f1e9,
      in 0x1f1eb..0x1f1ee,
      in 0x1f1f0..0x1f1f5,
      0x1f1f7,
      in 0x1f1fa..0x1f1ff -> true
      else -> false
    }
    0x1f1e9 -> when (nextCodePoint) {
      0x1f1ea,
      0x1f1ec,
      0x1f1ef,
      0x1f1f0,
      0x1f1f2,
      0x1f1f4,
      0x1f1ff -> true
      else -> false
    }
    0x1f1ea -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e8,
      0x1f1ea,
      0x1f1ec,
      0x1f1ed,
      in 0x1f1f7..0x1f1fa -> true
      else -> false
    }
    0x1f1eb -> when (nextCodePoint) {
      in 0x1f1ee..0x1f1f0,
      0x1f1f2,
      0x1f1f4,
      0x1f1f7 -> true
      else -> false
    }
    0x1f1ec -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e7,
      in 0x1f1e9..0x1f1ee,
      in 0x1f1f1..0x1f1f3,
      in 0x1f1f5..0x1f1fa,
      0x1f1fc,
      0x1f1fe -> true
      else -> false
    }
    0x1f1ed -> when (nextCodePoint) {
      0x1f1f0,
      0x1f1f2,
      0x1f1f3,
      0x1f1f7,
      0x1f1f9,
      0x1f1fa -> true
      else -> false
    }
    0x1f1ee -> when (nextCodePoint) {
      in 0x1f1e8..0x1f1ea,
      in 0x1f1f1..0x1f1f4,
      in 0x1f1f6..0x1f1f9 -> true
      else -> false
    }
    0x1f1ef -> when (nextCodePoint) {
      0x1f1ea,
      0x1f1f2,
      0x1f1f4,
      0x1f1f5 -> true
      else -> false
    }
    0x1f1f0 -> when (nextCodePoint) {
      0x1f1ea,
      in 0x1f1ec..0x1f1ee,
      0x1f1f2,
      0x1f1f3,
      0x1f1f5,
      0x1f1f7,
      0x1f1fc,
      0x1f1fe,
      0x1f1ff -> true
      else -> false
    }
    0x1f1f1 -> when (nextCodePoint) {
      in 0x1f1e6..0x1f1e8,
      0x1f1ee,
      0x1f1f0,
      in 0x1f1f7..0x1f1fb,
      0x1f1fe -> true
      else -> false
    }
    0x1f1f2 -> when (nextCodePoint) {
      0x1f1e6,
      in 0x1f1e8..0x1f1ed,
      in 0x1f1f0..0x1f1ff -> true
      else -> false
    }
    0x1f1f3 -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e8,
      in 0x1f1ea..0x1f1ec,
      0x1f1ee,
      0x1f1f1,
      0x1f1f4,
      0x1f1f5,
      0x1f1f7,
      0x1f1fa,
      0x1f1ff -> true
      else -> false
    }
    0x1f1f4 -> when (nextCodePoint) {
      0x1f1f2 -> true
      else -> false
    }
    0x1f1f5 -> when (nextCodePoint) {
      0x1f1e6,
      in 0x1f1ea..0x1f1ed,
      in 0x1f1f0..0x1f1f3,
      in 0x1f1f7..0x1f1f9,
      0x1f1fc,
      0x1f1fe -> true
      else -> false
    }
    0x1f1f6 -> when (nextCodePoint) {
      0x1f1e6 -> true
      else -> false
    }
    0x1f1f7 -> when (nextCodePoint) {
      0x1f1ea,
      0x1f1f4,
      0x1f1f8,
      0x1f1fa,
      0x1f1fc -> true
      else -> false
    }
    0x1f1f8 -> when (nextCodePoint) {
      in 0x1f1e6..0x1f1ea,
      in 0x1f1ec..0x1f1f4,
      in 0x1f1f7..0x1f1f9,
      0x1f1fb,
      in 0x1f1fd..0x1f1ff -> true
      else -> false
    }
    0x1f1f9 -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e8,
      0x1f1e9,
      in 0x1f1eb..0x1f1ed,
      in 0x1f1ef..0x1f1f4,
      0x1f1f7,
      0x1f1f9,
      0x1f1fb,
      0x1f1fc,
      0x1f1ff -> true
      else -> false
    }
    0x1f1fa -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1ec,
      0x1f1f2,
      0x1f1f3,
      0x1f1f8,
      0x1f1fe,
      0x1f1ff -> true
      else -> false
    }
    0x1f1fb -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1e8,
      0x1f1ea,
      0x1f1ec,
      0x1f1ee,
      0x1f1f3,
      0x1f1fa -> true
      else -> false
    }
    0x1f1fc -> when (nextCodePoint) {
      0x1f1eb,
      0x1f1f8 -> true
      else -> false
    }
    0x1f1fd -> when (nextCodePoint) {
      0x1f1f0 -> true
      else -> false
    }
    0x1f1fe -> when (nextCodePoint) {
      0x1f1ea,
      0x1f1f9 -> true
      else -> false
    }
    0x1f1ff -> when (nextCodePoint) {
      0x1f1e6,
      0x1f1f2,
      0x1f1fc -> true
      else -> false
    }
    else -> false
  }
} else {
  false
}

@Autogenerated fun ltrEmojiCharCount (codePoint: Int, codePointSize: Int, str: String, start: Int, end: Int): Int = when (codePoint) {
  0x2139,
  0x24c2,
  0x3297,
  0x3299,
  0x1f170,
  0x1f171,
  0x1f17e,
  0x1f17f,
  0x1f18e,
  in 0x1f191..0x1f19a,
  0x1f201,
  0x1f202,
  0x1f21a,
  0x1f22f,
  in 0x1f232..0x1f23a,
  0x1f250,
  0x1f251 -> {
    codePointSize
  }
  in 0x1f1e6..0x1f1ff -> {
    if (start + codePointSize < end) {
      val nextCodePoint = str.codePointAt(start + codePointSize)
      if (isKnownLtrEmoji(codePoint, nextCodePoint)) {
        val nextCodePointSize = Character.charCount(nextCodePoint)
        codePointSize + nextCodePointSize
      } else {
        0
      }
    } else {
      0
    }
  }
  else -> 0
}

@Autogenerated fun ltrSet () = setOf(
  "\u2139" /* ℹ */,
  "\u24C2" /* Ⓜ */,
  "\u3297" /* ㊗ */,
  "\u3299" /* ㊙ */,
  "\uD83C\uDD70" /* 🅰 */,
  "\uD83C\uDD71" /* 🅱 */,
  "\uD83C\uDD7E" /* 🅾 */,
  "\uD83C\uDD7F" /* 🅿 */,
  "\uD83C\uDD8E" /* 🆎 */,
  "\uD83C\uDD91" /* 🆑 */,
  "\uD83C\uDD92" /* 🆒 */,
  "\uD83C\uDD93" /* 🆓 */,
  "\uD83C\uDD94" /* 🆔 */,
  "\uD83C\uDD95" /* 🆕 */,
  "\uD83C\uDD96" /* 🆖 */,
  "\uD83C\uDD97" /* 🆗 */,
  "\uD83C\uDD98" /* 🆘 */,
  "\uD83C\uDD99" /* 🆙 */,
  "\uD83C\uDD9A" /* 🆚 */,
  "\uD83C\uDDE6\uD83C\uDDE8" /* 🇦🇨 */,
  "\uD83C\uDDE6\uD83C\uDDE9" /* 🇦🇩 */,
  "\uD83C\uDDE6\uD83C\uDDEA" /* 🇦🇪 */,
  "\uD83C\uDDE6\uD83C\uDDEB" /* 🇦🇫 */,
  "\uD83C\uDDE6\uD83C\uDDEC" /* 🇦🇬 */,
  "\uD83C\uDDE6\uD83C\uDDEE" /* 🇦🇮 */,
  "\uD83C\uDDE6\uD83C\uDDF1" /* 🇦🇱 */,
  "\uD83C\uDDE6\uD83C\uDDF2" /* 🇦🇲 */,
  "\uD83C\uDDE6\uD83C\uDDF4" /* 🇦🇴 */,
  "\uD83C\uDDE6\uD83C\uDDF6" /* 🇦🇶 */,
  "\uD83C\uDDE6\uD83C\uDDF7" /* 🇦🇷 */,
  "\uD83C\uDDE6\uD83C\uDDF8" /* 🇦🇸 */,
  "\uD83C\uDDE6\uD83C\uDDF9" /* 🇦🇹 */,
  "\uD83C\uDDE6\uD83C\uDDFA" /* 🇦🇺 */,
  "\uD83C\uDDE6\uD83C\uDDFC" /* 🇦🇼 */,
  "\uD83C\uDDE6\uD83C\uDDFD" /* 🇦🇽 */,
  "\uD83C\uDDE6\uD83C\uDDFF" /* 🇦🇿 */,
  "\uD83C\uDDE7\uD83C\uDDE6" /* 🇧🇦 */,
  "\uD83C\uDDE7\uD83C\uDDE7" /* 🇧🇧 */,
  "\uD83C\uDDE7\uD83C\uDDE9" /* 🇧🇩 */,
  "\uD83C\uDDE7\uD83C\uDDEA" /* 🇧🇪 */,
  "\uD83C\uDDE7\uD83C\uDDEB" /* 🇧🇫 */,
  "\uD83C\uDDE7\uD83C\uDDEC" /* 🇧🇬 */,
  "\uD83C\uDDE7\uD83C\uDDED" /* 🇧🇭 */,
  "\uD83C\uDDE7\uD83C\uDDEE" /* 🇧🇮 */,
  "\uD83C\uDDE7\uD83C\uDDEF" /* 🇧🇯 */,
  "\uD83C\uDDE7\uD83C\uDDF1" /* 🇧🇱 */,
  "\uD83C\uDDE7\uD83C\uDDF2" /* 🇧🇲 */,
  "\uD83C\uDDE7\uD83C\uDDF3" /* 🇧🇳 */,
  "\uD83C\uDDE7\uD83C\uDDF4" /* 🇧🇴 */,
  "\uD83C\uDDE7\uD83C\uDDF6" /* 🇧🇶 */,
  "\uD83C\uDDE7\uD83C\uDDF7" /* 🇧🇷 */,
  "\uD83C\uDDE7\uD83C\uDDF8" /* 🇧🇸 */,
  "\uD83C\uDDE7\uD83C\uDDF9" /* 🇧🇹 */,
  "\uD83C\uDDE7\uD83C\uDDFB" /* 🇧🇻 */,
  "\uD83C\uDDE7\uD83C\uDDFC" /* 🇧🇼 */,
  "\uD83C\uDDE7\uD83C\uDDFE" /* 🇧🇾 */,
  "\uD83C\uDDE7\uD83C\uDDFF" /* 🇧🇿 */,
  "\uD83C\uDDE8\uD83C\uDDE6" /* 🇨🇦 */,
  "\uD83C\uDDE8\uD83C\uDDE8" /* 🇨🇨 */,
  "\uD83C\uDDE8\uD83C\uDDE9" /* 🇨🇩 */,
  "\uD83C\uDDE8\uD83C\uDDEB" /* 🇨🇫 */,
  "\uD83C\uDDE8\uD83C\uDDEC" /* 🇨🇬 */,
  "\uD83C\uDDE8\uD83C\uDDED" /* 🇨🇭 */,
  "\uD83C\uDDE8\uD83C\uDDEE" /* 🇨🇮 */,
  "\uD83C\uDDE8\uD83C\uDDF0" /* 🇨🇰 */,
  "\uD83C\uDDE8\uD83C\uDDF1" /* 🇨🇱 */,
  "\uD83C\uDDE8\uD83C\uDDF2" /* 🇨🇲 */,
  "\uD83C\uDDE8\uD83C\uDDF3" /* 🇨🇳 */,
  "\uD83C\uDDE8\uD83C\uDDF4" /* 🇨🇴 */,
  "\uD83C\uDDE8\uD83C\uDDF5" /* 🇨🇵 */,
  "\uD83C\uDDE8\uD83C\uDDF7" /* 🇨🇷 */,
  "\uD83C\uDDE8\uD83C\uDDFA" /* 🇨🇺 */,
  "\uD83C\uDDE8\uD83C\uDDFB" /* 🇨🇻 */,
  "\uD83C\uDDE8\uD83C\uDDFC" /* 🇨🇼 */,
  "\uD83C\uDDE8\uD83C\uDDFD" /* 🇨🇽 */,
  "\uD83C\uDDE8\uD83C\uDDFE" /* 🇨🇾 */,
  "\uD83C\uDDE8\uD83C\uDDFF" /* 🇨🇿 */,
  "\uD83C\uDDE9\uD83C\uDDEA" /* 🇩🇪 */,
  "\uD83C\uDDE9\uD83C\uDDEC" /* 🇩🇬 */,
  "\uD83C\uDDE9\uD83C\uDDEF" /* 🇩🇯 */,
  "\uD83C\uDDE9\uD83C\uDDF0" /* 🇩🇰 */,
  "\uD83C\uDDE9\uD83C\uDDF2" /* 🇩🇲 */,
  "\uD83C\uDDE9\uD83C\uDDF4" /* 🇩🇴 */,
  "\uD83C\uDDE9\uD83C\uDDFF" /* 🇩🇿 */,
  "\uD83C\uDDEA\uD83C\uDDE6" /* 🇪🇦 */,
  "\uD83C\uDDEA\uD83C\uDDE8" /* 🇪🇨 */,
  "\uD83C\uDDEA\uD83C\uDDEA" /* 🇪🇪 */,
  "\uD83C\uDDEA\uD83C\uDDEC" /* 🇪🇬 */,
  "\uD83C\uDDEA\uD83C\uDDED" /* 🇪🇭 */,
  "\uD83C\uDDEA\uD83C\uDDF7" /* 🇪🇷 */,
  "\uD83C\uDDEA\uD83C\uDDF8" /* 🇪🇸 */,
  "\uD83C\uDDEA\uD83C\uDDF9" /* 🇪🇹 */,
  "\uD83C\uDDEA\uD83C\uDDFA" /* 🇪🇺 */,
  "\uD83C\uDDEB\uD83C\uDDEE" /* 🇫🇮 */,
  "\uD83C\uDDEB\uD83C\uDDEF" /* 🇫🇯 */,
  "\uD83C\uDDEB\uD83C\uDDF0" /* 🇫🇰 */,
  "\uD83C\uDDEB\uD83C\uDDF2" /* 🇫🇲 */,
  "\uD83C\uDDEB\uD83C\uDDF4" /* 🇫🇴 */,
  "\uD83C\uDDEB\uD83C\uDDF7" /* 🇫🇷 */,
  "\uD83C\uDDEC\uD83C\uDDE6" /* 🇬🇦 */,
  "\uD83C\uDDEC\uD83C\uDDE7" /* 🇬🇧 */,
  "\uD83C\uDDEC\uD83C\uDDE9" /* 🇬🇩 */,
  "\uD83C\uDDEC\uD83C\uDDEA" /* 🇬🇪 */,
  "\uD83C\uDDEC\uD83C\uDDEB" /* 🇬🇫 */,
  "\uD83C\uDDEC\uD83C\uDDEC" /* 🇬🇬 */,
  "\uD83C\uDDEC\uD83C\uDDED" /* 🇬🇭 */,
  "\uD83C\uDDEC\uD83C\uDDEE" /* 🇬🇮 */,
  "\uD83C\uDDEC\uD83C\uDDF1" /* 🇬🇱 */,
  "\uD83C\uDDEC\uD83C\uDDF2" /* 🇬🇲 */,
  "\uD83C\uDDEC\uD83C\uDDF3" /* 🇬🇳 */,
  "\uD83C\uDDEC\uD83C\uDDF5" /* 🇬🇵 */,
  "\uD83C\uDDEC\uD83C\uDDF6" /* 🇬🇶 */,
  "\uD83C\uDDEC\uD83C\uDDF7" /* 🇬🇷 */,
  "\uD83C\uDDEC\uD83C\uDDF8" /* 🇬🇸 */,
  "\uD83C\uDDEC\uD83C\uDDF9" /* 🇬🇹 */,
  "\uD83C\uDDEC\uD83C\uDDFA" /* 🇬🇺 */,
  "\uD83C\uDDEC\uD83C\uDDFC" /* 🇬🇼 */,
  "\uD83C\uDDEC\uD83C\uDDFE" /* 🇬🇾 */,
  "\uD83C\uDDED\uD83C\uDDF0" /* 🇭🇰 */,
  "\uD83C\uDDED\uD83C\uDDF2" /* 🇭🇲 */,
  "\uD83C\uDDED\uD83C\uDDF3" /* 🇭🇳 */,
  "\uD83C\uDDED\uD83C\uDDF7" /* 🇭🇷 */,
  "\uD83C\uDDED\uD83C\uDDF9" /* 🇭🇹 */,
  "\uD83C\uDDED\uD83C\uDDFA" /* 🇭🇺 */,
  "\uD83C\uDDEE\uD83C\uDDE8" /* 🇮🇨 */,
  "\uD83C\uDDEE\uD83C\uDDE9" /* 🇮🇩 */,
  "\uD83C\uDDEE\uD83C\uDDEA" /* 🇮🇪 */,
  "\uD83C\uDDEE\uD83C\uDDF1" /* 🇮🇱 */,
  "\uD83C\uDDEE\uD83C\uDDF2" /* 🇮🇲 */,
  "\uD83C\uDDEE\uD83C\uDDF3" /* 🇮🇳 */,
  "\uD83C\uDDEE\uD83C\uDDF4" /* 🇮🇴 */,
  "\uD83C\uDDEE\uD83C\uDDF6" /* 🇮🇶 */,
  "\uD83C\uDDEE\uD83C\uDDF7" /* 🇮🇷 */,
  "\uD83C\uDDEE\uD83C\uDDF8" /* 🇮🇸 */,
  "\uD83C\uDDEE\uD83C\uDDF9" /* 🇮🇹 */,
  "\uD83C\uDDEF\uD83C\uDDEA" /* 🇯🇪 */,
  "\uD83C\uDDEF\uD83C\uDDF2" /* 🇯🇲 */,
  "\uD83C\uDDEF\uD83C\uDDF4" /* 🇯🇴 */,
  "\uD83C\uDDEF\uD83C\uDDF5" /* 🇯🇵 */,
  "\uD83C\uDDF0\uD83C\uDDEA" /* 🇰🇪 */,
  "\uD83C\uDDF0\uD83C\uDDEC" /* 🇰🇬 */,
  "\uD83C\uDDF0\uD83C\uDDED" /* 🇰🇭 */,
  "\uD83C\uDDF0\uD83C\uDDEE" /* 🇰🇮 */,
  "\uD83C\uDDF0\uD83C\uDDF2" /* 🇰🇲 */,
  "\uD83C\uDDF0\uD83C\uDDF3" /* 🇰🇳 */,
  "\uD83C\uDDF0\uD83C\uDDF5" /* 🇰🇵 */,
  "\uD83C\uDDF0\uD83C\uDDF7" /* 🇰🇷 */,
  "\uD83C\uDDF0\uD83C\uDDFC" /* 🇰🇼 */,
  "\uD83C\uDDF0\uD83C\uDDFE" /* 🇰🇾 */,
  "\uD83C\uDDF0\uD83C\uDDFF" /* 🇰🇿 */,
  "\uD83C\uDDF1\uD83C\uDDE6" /* 🇱🇦 */,
  "\uD83C\uDDF1\uD83C\uDDE7" /* 🇱🇧 */,
  "\uD83C\uDDF1\uD83C\uDDE8" /* 🇱🇨 */,
  "\uD83C\uDDF1\uD83C\uDDEE" /* 🇱🇮 */,
  "\uD83C\uDDF1\uD83C\uDDF0" /* 🇱🇰 */,
  "\uD83C\uDDF1\uD83C\uDDF7" /* 🇱🇷 */,
  "\uD83C\uDDF1\uD83C\uDDF8" /* 🇱🇸 */,
  "\uD83C\uDDF1\uD83C\uDDF9" /* 🇱🇹 */,
  "\uD83C\uDDF1\uD83C\uDDFA" /* 🇱🇺 */,
  "\uD83C\uDDF1\uD83C\uDDFB" /* 🇱🇻 */,
  "\uD83C\uDDF1\uD83C\uDDFE" /* 🇱🇾 */,
  "\uD83C\uDDF2\uD83C\uDDE6" /* 🇲🇦 */,
  "\uD83C\uDDF2\uD83C\uDDE8" /* 🇲🇨 */,
  "\uD83C\uDDF2\uD83C\uDDE9" /* 🇲🇩 */,
  "\uD83C\uDDF2\uD83C\uDDEA" /* 🇲🇪 */,
  "\uD83C\uDDF2\uD83C\uDDEB" /* 🇲🇫 */,
  "\uD83C\uDDF2\uD83C\uDDEC" /* 🇲🇬 */,
  "\uD83C\uDDF2\uD83C\uDDED" /* 🇲🇭 */,
  "\uD83C\uDDF2\uD83C\uDDF0" /* 🇲🇰 */,
  "\uD83C\uDDF2\uD83C\uDDF1" /* 🇲🇱 */,
  "\uD83C\uDDF2\uD83C\uDDF2" /* 🇲🇲 */,
  "\uD83C\uDDF2\uD83C\uDDF3" /* 🇲🇳 */,
  "\uD83C\uDDF2\uD83C\uDDF4" /* 🇲🇴 */,
  "\uD83C\uDDF2\uD83C\uDDF5" /* 🇲🇵 */,
  "\uD83C\uDDF2\uD83C\uDDF6" /* 🇲🇶 */,
  "\uD83C\uDDF2\uD83C\uDDF7" /* 🇲🇷 */,
  "\uD83C\uDDF2\uD83C\uDDF8" /* 🇲🇸 */,
  "\uD83C\uDDF2\uD83C\uDDF9" /* 🇲🇹 */,
  "\uD83C\uDDF2\uD83C\uDDFA" /* 🇲🇺 */,
  "\uD83C\uDDF2\uD83C\uDDFB" /* 🇲🇻 */,
  "\uD83C\uDDF2\uD83C\uDDFC" /* 🇲🇼 */,
  "\uD83C\uDDF2\uD83C\uDDFD" /* 🇲🇽 */,
  "\uD83C\uDDF2\uD83C\uDDFE" /* 🇲🇾 */,
  "\uD83C\uDDF2\uD83C\uDDFF" /* 🇲🇿 */,
  "\uD83C\uDDF3\uD83C\uDDE6" /* 🇳🇦 */,
  "\uD83C\uDDF3\uD83C\uDDE8" /* 🇳🇨 */,
  "\uD83C\uDDF3\uD83C\uDDEA" /* 🇳🇪 */,
  "\uD83C\uDDF3\uD83C\uDDEB" /* 🇳🇫 */,
  "\uD83C\uDDF3\uD83C\uDDEC" /* 🇳🇬 */,
  "\uD83C\uDDF3\uD83C\uDDEE" /* 🇳🇮 */,
  "\uD83C\uDDF3\uD83C\uDDF1" /* 🇳🇱 */,
  "\uD83C\uDDF3\uD83C\uDDF4" /* 🇳🇴 */,
  "\uD83C\uDDF3\uD83C\uDDF5" /* 🇳🇵 */,
  "\uD83C\uDDF3\uD83C\uDDF7" /* 🇳🇷 */,
  "\uD83C\uDDF3\uD83C\uDDFA" /* 🇳🇺 */,
  "\uD83C\uDDF3\uD83C\uDDFF" /* 🇳🇿 */,
  "\uD83C\uDDF4\uD83C\uDDF2" /* 🇴🇲 */,
  "\uD83C\uDDF5\uD83C\uDDE6" /* 🇵🇦 */,
  "\uD83C\uDDF5\uD83C\uDDEA" /* 🇵🇪 */,
  "\uD83C\uDDF5\uD83C\uDDEB" /* 🇵🇫 */,
  "\uD83C\uDDF5\uD83C\uDDEC" /* 🇵🇬 */,
  "\uD83C\uDDF5\uD83C\uDDED" /* 🇵🇭 */,
  "\uD83C\uDDF5\uD83C\uDDF0" /* 🇵🇰 */,
  "\uD83C\uDDF5\uD83C\uDDF1" /* 🇵🇱 */,
  "\uD83C\uDDF5\uD83C\uDDF2" /* 🇵🇲 */,
  "\uD83C\uDDF5\uD83C\uDDF3" /* 🇵🇳 */,
  "\uD83C\uDDF5\uD83C\uDDF7" /* 🇵🇷 */,
  "\uD83C\uDDF5\uD83C\uDDF8" /* 🇵🇸 */,
  "\uD83C\uDDF5\uD83C\uDDF9" /* 🇵🇹 */,
  "\uD83C\uDDF5\uD83C\uDDFC" /* 🇵🇼 */,
  "\uD83C\uDDF5\uD83C\uDDFE" /* 🇵🇾 */,
  "\uD83C\uDDF6\uD83C\uDDE6" /* 🇶🇦 */,
  "\uD83C\uDDF7\uD83C\uDDEA" /* 🇷🇪 */,
  "\uD83C\uDDF7\uD83C\uDDF4" /* 🇷🇴 */,
  "\uD83C\uDDF7\uD83C\uDDF8" /* 🇷🇸 */,
  "\uD83C\uDDF7\uD83C\uDDFA" /* 🇷🇺 */,
  "\uD83C\uDDF7\uD83C\uDDFC" /* 🇷🇼 */,
  "\uD83C\uDDF8\uD83C\uDDE6" /* 🇸🇦 */,
  "\uD83C\uDDF8\uD83C\uDDE7" /* 🇸🇧 */,
  "\uD83C\uDDF8\uD83C\uDDE8" /* 🇸🇨 */,
  "\uD83C\uDDF8\uD83C\uDDE9" /* 🇸🇩 */,
  "\uD83C\uDDF8\uD83C\uDDEA" /* 🇸🇪 */,
  "\uD83C\uDDF8\uD83C\uDDEC" /* 🇸🇬 */,
  "\uD83C\uDDF8\uD83C\uDDED" /* 🇸🇭 */,
  "\uD83C\uDDF8\uD83C\uDDEE" /* 🇸🇮 */,
  "\uD83C\uDDF8\uD83C\uDDEF" /* 🇸🇯 */,
  "\uD83C\uDDF8\uD83C\uDDF0" /* 🇸🇰 */,
  "\uD83C\uDDF8\uD83C\uDDF1" /* 🇸🇱 */,
  "\uD83C\uDDF8\uD83C\uDDF2" /* 🇸🇲 */,
  "\uD83C\uDDF8\uD83C\uDDF3" /* 🇸🇳 */,
  "\uD83C\uDDF8\uD83C\uDDF4" /* 🇸🇴 */,
  "\uD83C\uDDF8\uD83C\uDDF7" /* 🇸🇷 */,
  "\uD83C\uDDF8\uD83C\uDDF8" /* 🇸🇸 */,
  "\uD83C\uDDF8\uD83C\uDDF9" /* 🇸🇹 */,
  "\uD83C\uDDF8\uD83C\uDDFB" /* 🇸🇻 */,
  "\uD83C\uDDF8\uD83C\uDDFD" /* 🇸🇽 */,
  "\uD83C\uDDF8\uD83C\uDDFE" /* 🇸🇾 */,
  "\uD83C\uDDF8\uD83C\uDDFF" /* 🇸🇿 */,
  "\uD83C\uDDF9\uD83C\uDDE6" /* 🇹🇦 */,
  "\uD83C\uDDF9\uD83C\uDDE8" /* 🇹🇨 */,
  "\uD83C\uDDF9\uD83C\uDDE9" /* 🇹🇩 */,
  "\uD83C\uDDF9\uD83C\uDDEB" /* 🇹🇫 */,
  "\uD83C\uDDF9\uD83C\uDDEC" /* 🇹🇬 */,
  "\uD83C\uDDF9\uD83C\uDDED" /* 🇹🇭 */,
  "\uD83C\uDDF9\uD83C\uDDEF" /* 🇹🇯 */,
  "\uD83C\uDDF9\uD83C\uDDF0" /* 🇹🇰 */,
  "\uD83C\uDDF9\uD83C\uDDF1" /* 🇹🇱 */,
  "\uD83C\uDDF9\uD83C\uDDF2" /* 🇹🇲 */,
  "\uD83C\uDDF9\uD83C\uDDF3" /* 🇹🇳 */,
  "\uD83C\uDDF9\uD83C\uDDF4" /* 🇹🇴 */,
  "\uD83C\uDDF9\uD83C\uDDF7" /* 🇹🇷 */,
  "\uD83C\uDDF9\uD83C\uDDF9" /* 🇹🇹 */,
  "\uD83C\uDDF9\uD83C\uDDFB" /* 🇹🇻 */,
  "\uD83C\uDDF9\uD83C\uDDFC" /* 🇹🇼 */,
  "\uD83C\uDDF9\uD83C\uDDFF" /* 🇹🇿 */,
  "\uD83C\uDDFA\uD83C\uDDE6" /* 🇺🇦 */,
  "\uD83C\uDDFA\uD83C\uDDEC" /* 🇺🇬 */,
  "\uD83C\uDDFA\uD83C\uDDF2" /* 🇺🇲 */,
  "\uD83C\uDDFA\uD83C\uDDF3" /* 🇺🇳 */,
  "\uD83C\uDDFA\uD83C\uDDF8" /* 🇺🇸 */,
  "\uD83C\uDDFA\uD83C\uDDFE" /* 🇺🇾 */,
  "\uD83C\uDDFA\uD83C\uDDFF" /* 🇺🇿 */,
  "\uD83C\uDDFB\uD83C\uDDE6" /* 🇻🇦 */,
  "\uD83C\uDDFB\uD83C\uDDE8" /* 🇻🇨 */,
  "\uD83C\uDDFB\uD83C\uDDEA" /* 🇻🇪 */,
  "\uD83C\uDDFB\uD83C\uDDEC" /* 🇻🇬 */,
  "\uD83C\uDDFB\uD83C\uDDEE" /* 🇻🇮 */,
  "\uD83C\uDDFB\uD83C\uDDF3" /* 🇻🇳 */,
  "\uD83C\uDDFB\uD83C\uDDFA" /* 🇻🇺 */,
  "\uD83C\uDDFC\uD83C\uDDEB" /* 🇼🇫 */,
  "\uD83C\uDDFC\uD83C\uDDF8" /* 🇼🇸 */,
  "\uD83C\uDDFD\uD83C\uDDF0" /* 🇽🇰 */,
  "\uD83C\uDDFE\uD83C\uDDEA" /* 🇾🇪 */,
  "\uD83C\uDDFE\uD83C\uDDF9" /* 🇾🇹 */,
  "\uD83C\uDDFF\uD83C\uDDE6" /* 🇿🇦 */,
  "\uD83C\uDDFF\uD83C\uDDF2" /* 🇿🇲 */,
  "\uD83C\uDDFF\uD83C\uDDFC" /* 🇿🇼 */,
  "\uD83C\uDE01" /* 🈁 */,
  "\uD83C\uDE02" /* 🈂 */,
  "\uD83C\uDE1A" /* 🈚 */,
  "\uD83C\uDE2F" /* 🈯 */,
  "\uD83C\uDE32" /* 🈲 */,
  "\uD83C\uDE33" /* 🈳 */,
  "\uD83C\uDE34" /* 🈴 */,
  "\uD83C\uDE35" /* 🈵 */,
  "\uD83C\uDE36" /* 🈶 */,
  "\uD83C\uDE37" /* 🈷 */,
  "\uD83C\uDE38" /* 🈸 */,
  "\uD83C\uDE39" /* 🈹 */,
  "\uD83C\uDE3A" /* 🈺 */,
  "\uD83C\uDE50" /* 🉐 */,
  "\uD83C\uDE51" /* 🉑 */
)
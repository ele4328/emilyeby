package io.github.ele4326.emilyeby

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorPalette
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val darkBackground: Color,
    val lightBackground: Color,
    val darkText: Color,
    val lightText: Color,
    val buttonColor: Color,
) {

}

object Maroon : ColorPalette {
    override val _50 = Color.rgb(0x800F2F)
    override val _100 = Color.rgb(0x800F2F)
    override val _200 = Color.rgb(0x800F2F)
    override val _300 = Color.rgb(0x800F2F)
    override val _400 = Color.rgb(0x800F2F)
    override val _500 = Color.rgb(0x800F2F)
    override val _600 = Color.rgb(0x800F2F)
    override val _700 = Color.rgb(0x800F2F)
    override val _800 = Color.rgb(0x800F2F)
    override val _900 = Color.rgb(0x800F2F)
}

object SitePalettes {
    val primary = SitePalette(
        darkBackground = Color.rgb(0xFFCCD5),
        lightBackground = Color.rgb(0xFFF0F3),
        darkText = Color.rgb(0x260013),
        lightText = Color.rgb(0xFFF6F6),
        buttonColor = Color.rgb(0x800F2F),
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return SitePalettes.primary
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.rgb(0xFAFAFA)
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.dark.background = Color.rgb(0x06080B)
    ctx.theme.palettes.dark.color = Colors.White
}

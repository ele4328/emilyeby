package io.github.ele4326.emilyeby.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.vars.color.ColorVar
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import io.github.ele4326.emilyeby.Body3SansSerifTextStyle
import io.github.ele4326.emilyeby.Maroon
import io.github.ele4326.emilyeby.components.widgets.AboutMeButton
import io.github.ele4326.emilyeby.components.widgets.ResumeButton
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Span
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

val FooterStyle = CssStyle.base {
    Modifier
        .backgroundColor(colorMode.toSitePalette().darkBackground)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Column(modifier.alignItems(AlignItems.Center) ) {
        SpanText("Connect with Me!", Modifier.color(ColorMode.current.toSitePalette().darkText))
        Row(
            FooterStyle.toModifier().then(modifier),
            horizontalArrangement = Arrangement.spacedBy(
                space = 16.px,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            val ctx = rememberPageContext()
            AboutMeButton { ctx.router.tryRoutingTo("/aboutMe") }
            ResumeButton { ctx.router.tryRoutingTo("/resume") }
        }
    }
}

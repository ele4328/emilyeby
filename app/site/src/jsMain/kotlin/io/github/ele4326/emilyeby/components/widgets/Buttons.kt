package io.github.ele4326.emilyeby.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.ele4326.emilyeby.Body3SansSerifTextStyle
import io.github.ele4326.emilyeby.CircleButtonVariant
import io.github.ele4326.emilyeby.Maroon
import io.github.ele4326.emilyeby.UncoloredButtonVariant
import io.github.ele4326.emilyeby.toSitePalette
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLAnchorElement

@Composable
fun AboutMeButton(onClick: () -> Unit) {
    Button(onClick = {
        onClick()
    }, colorPalette = Maroon,
        modifier = Modifier
            .borderRadius(10.px)      // more rounded edges
            .boxShadow(0.px, 2.px, 8.px, color = ColorMode.current.toSitePalette().darkText)
    ) {
        Div(Body3SansSerifTextStyle.toAttrs()) {
            SpanText(
                "About Me",
                Modifier.color(ColorMode.current.toSitePalette().lightText)
            )
        }
    }
}

@Composable
fun ResumeButton() {
    Button(
        onClick = {
            downloadPdf(
                url = "/Emily_Eby_Resume.pdf",
                filename = "Emily_Eby_Resume.pdf"
            )
        }, modifier = Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = ColorMode.current.toSitePalette().buttonColor
            )
            .backgroundColor(Color.transparent)
            .borderRadius(10.px)      // more rounded edges
            .boxShadow(0.px, 2.px, 8.px, color = ColorMode.current.toSitePalette().darkText)
    ) {
        Div(Body3SansSerifTextStyle.toAttrs()) {
            SpanText(
                "Resume",
                Modifier.color(ColorMode.current.toSitePalette().darkText)
            )
        }
    }
}

@Composable
fun LearnMoreButton(onClick: () -> Unit) {
    Button(
        onClick = {onClick()}, modifier = Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = ColorMode.current.toSitePalette().buttonColor
            )
            .backgroundColor(Color.transparent)
            .borderRadius(10.px)      // more rounded edges
            .boxShadow(0.px, 2.px, 8.px, color = ColorMode.current.toSitePalette().darkText)
    ) {
        Div(Body3SansSerifTextStyle.toAttrs()) {
            SpanText(
                "Learn More",
                Modifier.color(ColorMode.current.toSitePalette().darkText)
            )
        }
    }
}

fun downloadPdf(url: String, filename: String) {
    val anchor = document.createElement("a") as HTMLAnchorElement
    anchor.href = url
    anchor.download = filename
    anchor.style.display = "none"

    document.body?.appendChild(anchor)
    anchor.click()
    document.body?.removeChild(anchor)
}
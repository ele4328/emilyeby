package io.github.ele4326.emilyeby.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.ele4326.emilyeby.Header3SansSerifTextStyle
import io.github.ele4326.emilyeby.Header4SansSerifTextStyle
import io.github.ele4326.emilyeby.HeadlineTextStyle
import io.github.ele4326.emilyeby.Maroon
import io.github.ele4326.emilyeby.components.widgets.MainButton
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textDecoration
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span

@Composable
fun ProjectDetailPage(
    title: String,
    credits: String,
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier
        .fillMaxSize()
        .backgroundColor(ColorMode.current.toSitePalette().lightBackground).padding(topBottom = 40.px)
) {
    Column(
        modifier = modifier.padding(64.px).gap(32.px).fillMaxWidth()
    ) {
        Div(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .then(HeadlineTextStyle.toModifier())
                .toAttrs()
        ) {
            SpanText(title, Modifier.color(ColorMode.current.toSitePalette().darkText))
        }
        Div(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(TextAlign.Center)
                .then(Header4SansSerifTextStyle.toModifier())
                .toAttrs()
        ) {
            SpanText(credits, Modifier.color(ColorMode.current.toSitePalette().darkText))
        }

        content()

        Div(
            attrs = Modifier
                .fillMaxWidth()
                .display(DisplayStyle.Flex)
                .justifyContent(JustifyContent.Center)
                .toAttrs()
        ) {
            val ctx = rememberPageContext()
            MainButton({ ctx.router.tryRoutingTo("/projects") }, "Back to Projects")
        }
    }
}

@Composable
fun summaryAndInitialImage(
    src: String,
    alt: String,
    summary: String = "",
) {
    Column(modifier = Modifier.padding(leftRight =  8.px).gap(16.px).fillMaxWidth()) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Img(
                src = src,
                alt = alt,
                attrs = {
                    style {
                        borderRadius(20.px)
                    }
                }
            )
        }
    }
    Div {
        SpanText(summary, Modifier.color(ColorMode.current.toSitePalette().darkText))
    }
}

@Composable
fun subSection(
    title: String,
    text: List<String>,
    img: List<List<String>> = emptyList(),
    //first value in each list is src second value is alt
    //if have third and fourth it's because of row
    imgIndex: List<Int> = emptyList()
    //this is a list corresponding to the index of where the image will go
    //for example if the list is [0,3] the image are placed after the first and fourth text items
) {
    Div(
        attrs = Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .then(Header3SansSerifTextStyle.toModifier())
            .toAttrs()
    ) {
        SpanText(title, Modifier.color(ColorMode.current.toSitePalette().darkText))
    }
    var i = 0
    while (i < text.size) {
        Div {
            SpanText(text[i], Modifier.color(ColorMode.current.toSitePalette().darkText))
        }
        if (i in imgIndex) {
            Row(modifier = Modifier.gap(16.px).fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Box(contentAlignment = Alignment.Center) {
                    Img(
                        src = img[i][0],
                        alt = img[i][1],
                        attrs = {
                            style {
                                borderRadius(20.px)
                            }
                        }
                    )
                }
                if (img[i].size > 2) {
                    Box(contentAlignment = Alignment.Center) {
                        Img(
                            src = img[i][2],
                            alt = img[i][3],
                            attrs = {
                                style {
                                    borderRadius(20.px)
                                }
                            }
                        )
                    }
                }
            }
        }
        i++
    }
}

@Composable
fun LinkText(
    finalText: String = "",
    linkValue: String,
    linkText: String,
) {
    Span {
        SpanText(finalText, Modifier.color(ColorMode.current.toSitePalette().darkText))

        A(
            attrs = {
                href(linkValue)
                style {
                    color(Maroon._400)
                    textDecoration("underline")
                }
            }
        ) {
            SpanText(linkText)
        }
    }
}
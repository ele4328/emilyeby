package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.StyleVariable
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.css.objectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import io.github.ele4326.emilyeby.Body3SansSerifTextStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import io.github.ele4326.emilyeby.HeadlineTextStyle
import io.github.ele4326.emilyeby.Maroon
import io.github.ele4326.emilyeby.SitePalettes
import io.github.ele4326.emilyeby.SubheadlineTextStyle
import io.github.ele4326.emilyeby.components.layouts.PageLayoutData
import io.github.ele4326.emilyeby.components.sections.Projects
import io.github.ele4326.emilyeby.components.widgets.MainButton
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.marginTop
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

// Container that has a tagline and grid on desktop, and just the tagline on mobile
val HeroContainerStyle = CssStyle {
    base { Modifier.fillMaxWidth().alignContent(AlignContent.Center).padding(leftRight = 2.cssRem)}
}

// A demo grid that appears on the homepage because it looks good
val HomeGridStyle = CssStyle.base {
    Modifier
        .gap(0.5.cssRem)
        .width(70.cssRem)
        .height(18.cssRem)
}

private val GridCellColorVar by StyleVariable<Color>()
val HomeGridCellStyle = CssStyle.base {
    Modifier
        .backgroundColor(GridCellColorVar.value())
        .boxShadow(blurRadius = 0.6.cssRem, color = GridCellColorVar.value())
        .borderRadius(1.cssRem)
}


@InitRoute
fun initHomePage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData("Home"))
}

@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun HomePage() {
    Div(
        attrs = {
            style {
                property("overflow-y", "auto") // vertical scroll when needed
            }
        }
    ) {
        Column(Modifier.fillMaxSize()) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .styleModifier { property("height", "calc(100vh - 64px)") },
                contentAlignment = Alignment.Center
            ) {
                Row(
                    HeroContainerStyle
                        .toModifier()
                        .gap(80.px)
                        .fillMaxWidth()
                        .padding(leftRight = 25.cssRem),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box {

                        Column(Modifier.gap(24.px).fillMaxWidth()) {
                            Div(HeadlineTextStyle.toAttrs()) {
                                SpanText(
                                    "Emily Eby", Modifier.color(ColorMode.current.toSitePalette().darkText),
                                )
                            }
                            val aboutMeText =
                                "Designer passionate about making products that people are excited to keep using. I thrive off of collaborative environments where we all brainstorm solutions."

                            Div {
                                SpanText(aboutMeText, Modifier.color(ColorMode.current.toSitePalette().darkText))
                            }

                            val ctx = rememberPageContext()
                            MainButton({ ctx.router.tryRoutingTo("/aboutMe") })
                        }
                    }

                    Div(
                        attrs = {
                            style { // center horizontally
                                width(1500.px)         // container width
                                height(500.px)        // container height
                            }
                        }
                    ) {
                        Img(
                            src = "/images/profile.png",
                            alt = "Profile picture",
                            attrs = {
                                style {
                                    width(100.percent)
                                    height(100.percent)
                                    property("clip-path", "ellipse(50% 50% at 50% 50%)")
                                    property("object-position", "center 20%")
                                    objectFit(ObjectFit.Cover)
                                }
                            }
                        )
                    }
                }
            }
            Projects()
        }
    }
}

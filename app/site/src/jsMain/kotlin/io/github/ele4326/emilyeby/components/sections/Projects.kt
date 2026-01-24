package io.github.ele4326.emilyeby.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.css.objectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.verticalAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.ele4326.emilyeby.Body3SansSerifTextStyle
import io.github.ele4326.emilyeby.HeadlineTextStyle
import io.github.ele4326.emilyeby.SubheadlineTextStyle
import io.github.ele4326.emilyeby.components.widgets.LearnMoreButton
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Composable
fun Projects(
    modifier: Modifier = Modifier
    .fillMaxSize()
    .backgroundColor(ColorMode.current.toSitePalette().lightBackground).padding(topBottom = 40.px)
) {
    Box(
        modifier = modifier
            .fillMaxWidth().padding(leftRight = 5.vw),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = modifier
            .gap(48.px)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Div(HeadlineTextStyle.toAttrs()) {
                SpanText(
                    "Projects", Modifier.color(ColorMode.current.toSitePalette().darkText),
                )
            }
            val buzzDescription = "The goal of the app is to build community among women at Georgia Tech. Community is intended to be build around hobbies that users have in common with others. The app was designed through an iterative process from user and market research, to ideating across different mediums, and creating a prototype tested and evaluated through user interviews."
            ProjectItemLeft(modifier, "In the Buzz", buzzDescription, image = "/images/buzz.png", path = "/inTheBuzz")
            val climateDescription = "Climate Change is something that is widely discussed, but it can be difficult to understand the current and possible effects to the everyday person. This project aimed to use datasets to explain why climate change is important to users by illustrating the changes and risks they might face."
            ProjectItemRight(modifier, "Climate in Motion", climateDescription, image = "/images/climate.png", path = "/climateInMotion")
            val duolingoDescription = "Duolingo is used by thousands of users worldwide, but the language learning ability doesn’t always seem to transfer. This redesign aimed to determine why this is the case and improve upon the design using learning science and design principles."
            ProjectItemLeft(modifier, "Duolingo with Learning Optimization", duolingoDescription, image = "/images/duolingo.png", path = "/duolingo")
            val researchDescription = "2x2 within-participants study varying the amount of robot autonomy on one axis and the competency of the robot using a UR5 robot available through the Georgia Tech Research Institute with teleoperation via Wizard of Oz. Trust was measured via the TOAST scale."
            ProjectItemRight(modifier, "Level of Automation & User Trust", researchDescription, image = "/images/hri.png", path = "/trustResearch")
        }
    }
}

@OptIn(DelicateApi::class)
@Composable
fun ProjectItemLeft(
    modifier: Modifier = Modifier.fillMaxWidth().backgroundColor(ColorMode.current.toSitePalette().lightBackground),
    title: String = "",
    description: String = "",
    image: String = "",
    path: String = "",
) {
    val breakpoint = rememberBreakpoint()
    if (breakpoint > Breakpoint.SM) {
        Row(modifier.gap(48.px), horizontalArrangement = Arrangement.Center) {
            if (image.isNotEmpty()) {
                ExampleImage(title = title, image = image)
            }
            ProjectDescription(
                modifier = modifier,
                title = title,
                description = description,
                path = path,
                horizontalAlign = Alignment.Start
            )
        }
    } else {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            if (image.isNotEmpty()) {
                ExampleImage(title = title, image = image)
            }
            ProjectDescription(
                modifier = modifier,
                title = title,
                description = description,
                path = path,
                horizontalAlign = Alignment.CenterHorizontally
            )
        }
    }
}

@OptIn(DelicateApi::class)
@Composable
fun ProjectItemRight(
    modifier: Modifier = Modifier.fillMaxWidth().backgroundColor(ColorMode.current.toSitePalette().lightBackground),
    title: String = "",
    description: String = "",
    image: String = "",
    path: String = "",
) {
    val breakpoint = rememberBreakpoint()
    if (breakpoint > Breakpoint.SM) {
        Row(modifier.gap(48.px), horizontalArrangement = Arrangement.Center) {
            ProjectDescription(
                modifier = modifier,
                title = title,
                description = description,
                path = path,
                horizontalAlign = Alignment.End
            )
            if (image.isNotEmpty()) {
                ExampleImage(title = title, image = image, width = 400.px)
            }
        }
    }else {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            if (image.isNotEmpty()) {
                ExampleImage(title = title, image = image, width = 400.px)
            }
            ProjectDescription(
                modifier = modifier,
                title = title,
                description = description,
                path = path,
                horizontalAlign = Alignment.CenterHorizontally
            )
        }
    }
}

@Composable
fun ExampleImage(
    title: String = "",
    image: String = "",
    width: CSSNumeric = 180.px
) {
    Img(
        src = image,
        alt = title + "image",
        attrs = {
            style {
                width(width)
                height(385.px)
                objectFit(ObjectFit.Cover)
                borderRadius(20.px)
            }
        }
    )
}

@OptIn(DelicateApi::class)
@Composable
fun ProjectDescription(
    modifier: Modifier = Modifier.fillMaxWidth().backgroundColor(ColorMode.current.toSitePalette().lightBackground),
    title: String = "",
    description: String = "",
    path: String = "",
    horizontalAlign: Alignment.Horizontal = Alignment.Start
) {
    val breakpoint = rememberBreakpoint()
    Column(modifier =
        modifier.gap(10.px).width(700.px).padding(all = 32.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = horizontalAlign
    ) {
        Div(SubheadlineTextStyle.toAttrs()) {
            SpanText(
                title,
                Modifier.color(ColorMode.current.toSitePalette().darkText)
            )
        }
        val textAlign = if (horizontalAlign == Alignment.Start) {
            TextAlign.Start
        } else {
            TextAlign.End
        }
        if (breakpoint > Breakpoint.SM) {
            Div(Body3SansSerifTextStyle.toAttrs()) {
                SpanText(
                    description,
                    Modifier
                        .color(ColorMode.current.toSitePalette().darkText)
                        .display(DisplayStyle.Block)
                        .textAlign(textAlign)
                )
            }
        }
        val ctx = rememberPageContext()
        LearnMoreButton { ctx.router.tryRoutingTo(path)  }
    }
}
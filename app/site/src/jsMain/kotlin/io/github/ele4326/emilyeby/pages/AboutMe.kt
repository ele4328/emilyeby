package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.objectFit
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.*
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.layout.NoLayout
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobwebx.frontmatter.*
import com.varabyte.kobwebx.markdown.*
import io.github.ele4326.emilyeby.HeadlineTextStyle
import io.github.ele4326.emilyeby.components.sections.Footer
import io.github.ele4326.emilyeby.components.sections.NavHeader
import io.github.ele4326.emilyeby.components.sections.Projects
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img

@Page("/aboutMe")
@Composable
fun AboutMePage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
            .height(100.vh)
    ) {
        NavHeader()
        Column(modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(ColorMode.current.toSitePalette().lightBackground)
                .padding(topBottom = 64.px, leftRight = 92.px)
                .gap(16.px)
                .weight(1f)
                .alignContent(AlignContent.Center)
        ) {
            Row(modifier = Modifier.fillMaxWidth().gap(32.px)) {
                Column(modifier = Modifier.fillMaxWidth().padding(leftRight = 64.px).gap(16.px).align(Alignment.Bottom)) {
                    Div(
                        attrs = Modifier
                            .fillMaxWidth()
                            .textAlign(TextAlign.Center)
                            .then(HeadlineTextStyle.toModifier())
                            .padding(topBottom = 32.px)
                            .toAttrs()
                    ) {
                        SpanText("Hi, I'm Emily", Modifier.color(ColorMode.current.toSitePalette().darkText))
                    }
                    val aboutMeText1 =
                        "    I’m a Bay Area-based designer with a background in software engineering and a master’s specializing in Human Computer Interaction from Georgia Tech. I’m hoping to use my software engineering experience as a foundation to create designs with a multidisciplinary team. Design does not exist within a vacuum.  I understand the importance of clear communication, documentation, and prototyping while keeping in mind system constraints and ensuring a consistent user-centered experience."

                    Div {
                        SpanText(aboutMeText1, Modifier.color(ColorMode.current.toSitePalette().darkText))
                    }

                    val aboutMeText2 =
                        "    Ever since I began my UX journey with Don Norman’s “The Design of Everyday Things” I’ve been fascinated with how technology can become more intuitive for all users, especially as technology continues to shape our lives. I’m especially interested in making computing more inclusive, equitable, and accessible."

                    Div {
                        SpanText(aboutMeText2, Modifier.color(ColorMode.current.toSitePalette().darkText))
                    }
                }
                Img(
                    src = "/images/meImage.png",
                    alt = "Profile picture",
                    attrs = {
                        style {
                            width(23.percent)
                            objectFit(ObjectFit.Cover)
                        }
                    }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(leftRight = 64.px)
                    .gap(16.px)
            ) {

                val aboutMeText3 =
                    "    My master’s degree at Georgia Tech allowed me to put this passion into actionable projects, from improving education to creating a safe space for women in the tech industry. This gave me experience from user interviews, wireframing, and iterative design processes. Building on these experiences, I began working as a full stack software developer at SAP. During this time, I was able to gain an understanding of the product life cycle across mobile and web applications impacting millions of users. This gives me a unique perspective on creating production-ready designs."

                Div {
                    SpanText(aboutMeText3,
                        Modifier.color(ColorMode.current.toSitePalette().darkText).fillMaxWidth()
                    )
                }

                val aboutMeText4 =
                    "    I am currently looking to transition to full time design work where I am excited to bring my technical and design background to the team. I welcome the opportunity to connect! "

                Div {
                    SpanText(aboutMeText4,
                        Modifier.color(ColorMode.current.toSitePalette().darkText).fillMaxWidth()
                    )
                }
            }

        }
        Footer()
    }
}
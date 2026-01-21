package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.*
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.layout.NoLayout
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobwebx.frontmatter.*
import com.varabyte.kobwebx.markdown.*
import io.github.ele4326.emilyeby.components.sections.Footer
import io.github.ele4326.emilyeby.components.sections.NavHeader
import io.github.ele4326.emilyeby.components.sections.ProjectDetailPage
import io.github.ele4326.emilyeby.components.sections.summaryAndInitialImage
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent

@Page("/duolingo")
@Composable
fun DuolingoPage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
    ) {
        NavHeader()
        ProjectDetailPage(
            "Duolingo Redesign",
            "By Emily Eby, Max Tang, Triem Le, Mohammed Assabti, and Hope Phan",
            {
                summaryAndInitialImage(
                    "/images/Duolingo/initial.png",
                    "Image from Duolingo Redesign",
                    "    Duolingo is one of the most popular language learning apps. It is known for it’s cute characters, streak freezes, and bright colors. Unfortunately, many people still struggle to make progress in learning languages. Our team chose to redesign Duolingo to optimize the learning experience using sources such as “The Cambridge Handbook of the Learning Sciences” (Cambridge University Press) and “How Learning Works: Seven Research-Based Principles for Smart Teaching” (Susan A. Ambrose, Michael W. Bridges, Michele DiPietro, Marsha C. Lovett, Marie K. Norman). Multiple prototyping stages including user testing were completed to determine what changes were working and what were not, culminating in a high-fidelity prototype."
                )
            }
        )
        Footer()
    }
}
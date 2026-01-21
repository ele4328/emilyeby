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

@Page("/trustResearch")
@Composable
fun TrustResearchPage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
    ) {
        NavHeader()
        ProjectDetailPage(
            "The Relationship Between Level of Automation & User Trust in HRI",
            "By Isaac Dale, Emily Eby, Yu Hang He, and Charles Jayasinha",
            {
                summaryAndInitialImage(
                    "/images/HRI/initial.png",
                    "Image from Human Robot Trust Project",
                    "    Robots have become increasingly present across home and work environments. Due to this, trust has become especially important to understand to see if people are willing to use the robots around them. Our group wanted to determine how the mistakes that robots make affect how we trust them, and how this trust is affected by automation without an operator.\n" +
                            "    The main question for this study was: How does level of robot autonomy (LoRA) influence user trust? This was evaluated using a 2x2 within-participant study varying the amount of robot autonomy on one axis and the competency of the robot. This means that our secondary question was: Does robot competency affect user trust? The experiment was conducted with a UR5 robot available through the Georgia Tech Research Institute with teleoperation. The low autonomy version was with the teleoperator visible, the high autonomy was a Wizard of Oz with no teleoperator visible. Users were then asked about their level of trust using TOAST after each task. Before the study they were asked the GAToRS scale to determine familiarity and perception of robots."
                )
            }
        )
        Footer()
    }
}
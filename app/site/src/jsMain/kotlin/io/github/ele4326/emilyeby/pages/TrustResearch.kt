package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.objectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
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
import io.github.ele4326.emilyeby.components.sections.subSection
import io.github.ele4326.emilyeby.components.sections.summaryAndInitialImage
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Img

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
                subSection(
                    "Related Work",
                    listOf("    Trust in human-robot interaction (HRI) is a significant element in human-robot collaboration, as it affects willingness to share/allocate tasks as well as exchange information [1] Much of the past research on the factors that influence HRI trust, indicates that robot performance-related factors (e.g. competency, level of robot automation) influence this [3] Level of robot automation (LoRA), research indicates that more autonomous robots are perceived as more intelligent but less conducive to feelings of social presence [4] To build on this, we planned to investigate the effect of LoRA & robot competency on HRI trust as defined by the understanding and performance dimensions defined in the trust in automated systems (TOAST) scale [7] We will used the level of autonomy taxonomy established in a previously proposed LoRA scale. [6]")
                )
                subSection(
                    "Approach",
                    listOf("    A Qualtrics survey assessed trust in robot system at different levels of autonomy (teleoperator vs. autonomous) and competence (failure vs. success) by showing the user a video of a robot trying to place a banana on the tray for the user. The robot used is a UR-5 robot which was teleoperated and used Wizard of Oz in the autonomous case. The survey used the Trust of Automated Systems (TOAST) scale which gives a subscore for Understanding and Performance allowing a greater understanding of where trust is being affected. We also measured attitude towards robots using the general attitude towards robots scale (GATORS) to understand how user attitude can affect the results. 34 participants answered the survey. The 2x2 within subjects design led to 4 separate videos to assess their trust in each system using the trust of automated systems test (TOAST). We analyzed the results with a 2-way ANOVA for Understanding and Performance subscores of the TOAST Scale.")
                )
                subSection(
                    "Results",
                    listOf(
                        "    Overall the GAToRS showed that our users viewed a high potential for both negative and positive societal impacts. However, the users had a higher score for positive personal impact when compared to negative personal impact. This illustrates that users recognize the importance of robots, and have a slightly more positive viewpoint regarding them.",
                        "    In order to compare the results of the TOAST scores. Two-Way ANOVA was run on both the Understanding and Performance sub scores. Overall the results showed high understanding across the board with no statistical significance in any of the categories. The results for performance showed no statistical significance according to level of automation. However there was high statistical significance between the success and failure scenarios. This suggests that trust is not affected by autonomy level, yet is highly affected by mistakes made."
                    ),
                    listOf(
                        listOf("/images/HRI/GATORS.png", "GATORS Score"),
                        listOf("/images/HRI/TOAST.png", "TOAST Score", "/images/HRI/ANOVA.png", "ANOVA Results"),
                        listOf("/images/HRI/Results.png", "Results")
                    ),
                    listOf(0,1)
                )
                Box(modifier = Modifier.fillMaxWidth() ,contentAlignment = Alignment.Center) {
                    Img(
                        src = "/images/HRI/Results.png",
                        alt = "Results",
                        attrs = {
                            style {
                                borderRadius(20.px)
                                width(100.percent)
                                objectFit(ObjectFit.Cover)
                            }
                        }
                    )
                }
                subSection(
                    "References",
                    listOf(
                        "[1] A. Freedy, E. DeVisser, G. Weltman and N. Coeyman, \"Measurement of trust in human-robot collaboration,\" 2007 International Symposium on Collaborative Technologies and Systems, Orlando, FL, USA, 2007, pp. 106-114, doi: 10.1109/CTS.2007.4621745.",
                        "[2] Lee, J. D., & See, K. A. (2004). Trust in Automation: Designing for Appropriate Reliance. Human Factors, 46(1), 50-80. https://doi.org/10.1518/hfes.46.1.50_30392",
                        "[3] Hancock, P. A., Billings, D. R., Schaefer, K. E., Chen, J. Y. C., de Visser, E. J., & Parasuraman, R. (2011). A Meta-Analysis of Factors Affecting Trust in Human-Robot Interaction. Human Factors, 53(5), 517-527.",
                        "[4] J. J. Choi, Y. Kim and S. S. Kwak, \"The autonomy levels and the human intervention levels of robots: The impact of robot types in human-robot interaction,\" The 23rd IEEE International Symposium on Robot and Human Interactive Communication, Edinburgh, UK, 2014, pp. 1069-1074, doi: 10.1109/ROMAN.2014.6926394.",
                        "[5] Latikka, R., Savela, N., Koivula, A. et al. Attitudes Toward Robots as Equipment and Coworkers and the Impact of Robot Autonomy Level. Int J of Soc Robotics 13, 1747–1759 (2021). https://doi.org/10.1007/s12369-020-00743-9",
                        "[6] Beer, J. M., Fisk, A. D., & Rogers, W. A. (2014). Toward a framework for levels of robot autonomy in human-robot interaction. Journal of human-robot interaction, 3(2), 74–99. https://doi.org/10.5898/JHRI.3.2.Beer",
                        "[7] Wojton, H. M., Porter, D., T Lane, S., Bieber, C., & Madhavan, P. (2020). Initial validation of the trust of automated systems test (TOAST). The Journal of social psychology, 160(6), 735–750. https://doi.org/10.1080/00224545.2020.1749020"
                    )
                )
            }
        )
        Footer()
    }
}
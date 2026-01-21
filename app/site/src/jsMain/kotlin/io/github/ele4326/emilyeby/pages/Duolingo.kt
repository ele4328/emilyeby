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
import io.github.ele4326.emilyeby.components.sections.LinkText
import io.github.ele4326.emilyeby.components.sections.NavHeader
import io.github.ele4326.emilyeby.components.sections.ProjectDetailPage
import io.github.ele4326.emilyeby.components.sections.subSection
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
                subSection(
                    "Learning Science Research and Choosing an App",
                    listOf(
                        "    Before we could begin the redesign, we wanted to ensure our app was based in learning science. Reading was done individually, and as a group we determine characteristics that were important to successful learning, such as student motivation, accessibility, and measuring understanding. From there, educational technology platforms were investigated to determine where they could be improved, and what areas were strong. The following technologies were considered for redesign: Duolingo, Quizlet, Kahoot, Coursera, and IXL. Affinity Diagrams were completed for each technology to determine areas of strength and improvement. Possible solutions to these areas were brainstormed for feasibility. These solutions were weighed, and it seemed the technology with the most potential impactful solutions was Duolingo.",
                        "    Five solutions that we thought would be useful are: Designing a more comprehensive pre-test to determine fuller picture of knowledge, add regional specific vocabulary especially for widely spoken languages like Spanish and Arabic, place more emphasis on grammar early on and explain the structure of grammar, add a place for all the words that you have learned for easy access, and include the option to have a virtual native instructor."
                    ),
                    listOf(
                        listOf("/images/Duolingo/AffinityDiagram.png", "Affinity Diagram")
                    ),
                    listOf(0)
                )
                subSection(
                    "Storyboard and Low-Fidelity Paper Prototype",
                    listOf("    The next step was to create a storyboard and paper prototype to mock out the potential interactions that users would have with the new redesign. Users were asked to interact with the paper prototype and talk aloud as they made decisions or ran into difficulties. The goal was to ensure that design decisions and learning benefits were the focus, before introducing colors and detailed images as these are considered added benefits."),
                    listOf(
                        listOf("/images/Duolingo/Storyboard.png", "Storyboard", "/images/Duolingo/PaperPrototype.png", "Paper Prototype"),
                    ),
                    listOf(0)
                )
                subSection(
                    "Mid-Fidelity Figma Prototype",
                    listOf("    After the user tests of the paper prototype, a mid-fidelity Figma prototype was created implementing the feedback from the user test. New screens were added to Duolingo such as a Vocabulary page for students to refer back to at any time. This prototype was also tested with users on the Figma design. This interview also gave us a change to see if the user experience including visibility and ease of use integrated seamlessly with the existing application and the user expectations."),
                    listOf(
                        listOf("/images/Duolingo/MidFidelityPrototype.png", "Mid-Fidelity Prototype")
                    ),
                    listOf(0)
                )
                subSection(
                    "High Fidelity Figma Prototype Iterations",
                     listOf("    From there, a high fidelity prototype was created combining all of the feedback from the previous user testing (such as making the bar visible with the iPhone notch). Additionally new features were added such as a comprehensive pre-test to place the user and easily display progress throughout the sections. Other visual changes were made including colors and adding dropdown menus. Two rounds of user testing and adjustments were made to ensure changes were consistent with user needs."),
                    listOf(
                        listOf("/images/Duolingo/HighFidelity1.png", "High Fidelity Prototype", "/images/Duolingo/HighFidelity2.png", "High Fidelity Prototype")
                    ),
                    listOf(0)
                )
                subSection(
                    "Final Prototype",
                    listOf("    For the final prototype all of the feedback from previous user tests was adjusted, and possible learning outcomes was gauges. At this stage, many of the changes were small and by personal preference, so a larger sample size of users was helpful to determine necessary changes."),
                    listOf(
                        listOf("/images/Duolingo/FinalPrototype.png", "Final Prototype")
                    ),
                    listOf(0)
                )
                LinkText(
                    "To view the final design please go to: ",
                    "https://www.figma.com/design/YtTh4GgUZpXLtWQ3BjBAAH/High-Fidelity-Prototype?node-id=0-1&p=f&t=nL0aTj4Q8aFyPiVU-0",
                    "Figma File"
                )
                LinkText(
                    "To view the usability video please go to: ",
                    "https://drive.google.com/file/d/1Tk5ks1yfGTS9enUuBkgJS27xYdEDSjS5/view",
                    "Video"
                )
            }
        )
        Footer()
    }
}
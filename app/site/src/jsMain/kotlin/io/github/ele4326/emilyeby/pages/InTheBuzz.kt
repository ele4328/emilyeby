package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import io.github.ele4326.emilyeby.components.sections.Footer
import io.github.ele4326.emilyeby.components.sections.LinkText
import io.github.ele4326.emilyeby.components.sections.NavHeader
import io.github.ele4326.emilyeby.components.sections.ProjectDetailPage
import io.github.ele4326.emilyeby.components.sections.subSection
import io.github.ele4326.emilyeby.components.sections.summaryAndInitialImage
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent

@Page("/inTheBuzz")
@Composable
fun InTheBuzzPage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
    ) {
        NavHeader()
        ProjectDetailPage(
            "In the Buzz",
            "By Kaylin Belwood, Natalie Davis, Emily Eby, Ritika Gehani, Annika Pedersen",
            {
                summaryAndInitialImage(
                    "/images/InTheBuzz/initial.png",
                    "Image from InTheBuzz",
                    "    The goal of the app is to build community among women at Georgia Tech. Community is intended to be build around hobbies that users have in common with others. The primary tasks that the user can complete include messaging women, finding events, creating events, and viewing statistics for events."
                )
                subSection(
                    "Requirements Gathering",
                    listOf(
                        "    The first step in the process was determining what the market and user requirements where. The first step in this process was interviewing a total of 15 users. From there an affinity diagram was created in order to visualize the main components of the responses from the users. This was used to generate possible tasks for our users to complete.",
                        "    Next, two personas were generated in order to provide a greater understanding of the user base that we were trying to reach. These personas would be used later in the process to generate scenarios and storyboards.",
                        "    Next we focused on the current market to determine what was currently being used. A UI critique was completed for two applications: Facebook Groups, and the app Hey! VINA. A hierarchical task analysis was completed for Hey! VINA which was the application that appeared to have the most similar goals to the application that we were hoping to create. We determined that one of the major gaps in these applications is user base. Either the user base was too large (Facebook Groups) or too small to meet people (Hey! VINA). By targeting Georgia Tech specifically, we hoped to avoid some of these problems.\n" +
                                "\n" +
                                "    Lastly, the basic usability and utility goals were considered to keep in mind throughout the next steps of the design process. Some goals that were considered include learnability, efficiency, effectiveness, usefulness, satisfaction, and memorability. These goals were kept broad at this step in the process to keep options open."
                    ),
                    listOf(
                        listOf("/images/InTheBuzz/AffinityDiagram.png", "Affinity Diagram"),
                        listOf("/images/InTheBuzz/persona1.png", "Heidi Simmons Persona", "/images/InTheBuzz/persona2.png", "Abigail Navarro Persona")
                    ),
                    listOf(0,1)
                )
                subSection(
                    "Ideation",
                    listOf(
                        "    To determine possible ways to achieve our goal of community building among women at Georgia Tech while meeting the requirements as discussed, a crazy 8 exercise and How Might We exercise was completed by every member of the team. These ideas were compiled to determine which idea might best achieve our goal.",
                        "    From here, three ideas were determined to best fit our goals: Mobile Application, “Buzz Stanley,” and a Website. Each was explored thoroughly in order to determine the best fit for our use case. For all of the applications a storyboard, two iterations of a prototype, and a scenario were developed following the persona Abigail.\n" +
                                "    The first idea that was explored was a mobile app. It was determined to be flexible and easy to understand for our user base. It was also similar to one of the applications that we reviewed in the UI critique during our requirements gathering. Possible interaction breakdowns included user engagement and privacy. However, these were believed possible to mitigate if chosen.",
                        "    The second idea was “Buzz Stanley.” This was based off of the children’s book story/classroom activity where a student would take Stanley on adventures and report back to their classmates. “Buzz Stanley” was an idea that would replace this with a digital artifact. The original idea was to have a stuffed Buzz Stanley with a camera and microphone integrated inside. Due to interaction breakdowns of having a physical device being passed around, potential other ideas included passcodes or other circulating digital artifacts that would only allow some users to post at certain times. Possible breakdowns included a difficult to learn and efficiency to use the product. However, memorability and satisfaction was anticipated to be higher. Due to the novelty of the idea, the main focus was on idea generation rather than a more polished prototype.",
                        "    The final idea that was investigated was a website. This was seen as potentially beneficial as all students on campus had a laptop, so no new device or application would be necessary to use the application successfully. Similar to the mobile application, the main concerns were privacy and user interaction that were believed to be able to be addressed through moderators and increased privacy rules.",
                        "    After the generation of all three ideas, they were rated across the usability and utility goals that were developed in the requirements gathering phase. The number of common and novel features was evaluated, as well as anticipated steps to achieve major tasks. From there we were able to determine that the mobile application was best suited to achieve our goals. This is what went forward to the next phase of design."
                    ),
                    listOf(
                        listOf("/images/InTheBuzz/IdeaGenerating.png", "Idea Generating"),
                        listOf("/images/InTheBuzz/MobileStoryboard.png", "Mobile Storyboard", "/images/InTheBuzz/MobilePrototype.png", "Mobile Prototype"),
                        listOf("/images/InTheBuzz/BuzzStanleyStoryboard.png", "Buzz Stanley Storyboard", "/images/InTheBuzz/BuzzStanleyPrototype.png", "Buzz Stanley Prototype"),
                        listOf("/images/InTheBuzz/WebStoryboard.png", "Web Storyboard", "/images/InTheBuzz/WebPrototype.png", "Web Prototype")
                    ),
                    listOf(0,1,2,3)
                )
                subSection(
                    "Prototyping",
                    listOf("    Prototyping involved finalizing the mobile application design that is seen in the category “The Final Design.” Figma was utilized in order to complete this. To do this, it was determined that there are four main tasks that the user must complete in order to have the app achieve our goal. These tasks were determined to be the following:\n" +
                            "        *  Message women\n" +
                            "        *  Finding Events\n" +
                            "        *  Creating Events\n" +
                            "        *  Viewing statistics\n" +
                            "    Messaging women, finding events, and creating events were tasks for our primary stakeholders of women at Georgia Tech. Creating events and viewing statistics were for our secondary and tertiary stakeholders (club organizers and GT admin respectively).\n" +
                            "\n" +
                            "    Next, we created an evaluation plan that would be used in the next phase of the project. This involved a demo script and questionnaire that would be given to our users for testing purposes. This questionnaire includes Likert scale questions, semantic questions, and qualitative open-ended questions."),
                    listOf(),
                    listOf()
                )
                subSection(
                    "Evaluation and Final Design",
                    listOf("    The final step of the process is evaluating the design. We used the evaluation plan in the prototyping phase in order to conduct user tests across our primary, secondary, and tertiary users. The evaluation involved recorded interviews of the Figma prototype while recording metrics such as clicks and time taken for each task. This was determine the effectiveness of our product in achieving our goal of building community among women at Georgia Tech. Limitations and reflections upon the product will be vital.",),
                    listOf(listOf("/images/InTheBuzz/FinalImage.png", "Final Image")),
                    listOf(0)
                )
                LinkText(
                    "To view the final design please go to: ",
                    "https://www.figma.com/design/f6Sa6iUxVKmMep0BAGdQWA/In-the-Buzz?node-id=0-1&p=f&t=Ln1TTolzPBJJ66QR-0",
                    "Figma File"
                )
            }
        )
        Footer()
    }
}
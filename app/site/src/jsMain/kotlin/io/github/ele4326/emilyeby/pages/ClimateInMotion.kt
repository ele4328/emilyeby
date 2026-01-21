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

@Page("/climateInMotion")
@Composable
fun ClimateInMotionPage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
    ) {
        NavHeader()
        ProjectDetailPage(
            "Climate in Motion",
            "By Guy Broome, Grace Driskill, Emily Eby, and Alysha Irvin",
            {
                summaryAndInitialImage(
                    "/images/ClimateInMotion/initial.png",
                    "Image from ClimateInMotion",
                    "    The project introduces climate change by showing how temperature has changed from 1880 to present day. Anomalies from the baseline period of 1951-1980 are used to illustrate the increase in temperature and the accelerating rate of change. Next, exposures to extreme weather events are discussed with emphasis on the fact every area except Tokelau have extreme weather events which are expected to increase with climate change. Various visualization techniques from Sand Dance unit visualizations, maps, and heatmaps are utilized to provide different viewpoints of the data. From there Delta-O-18 values are visualized showing the increased rate of polar snow and ice depletion likely due to these temperature increases. These changes are especially prominent in polar regions. Finally, a map of the United States is presented highlighting anticipated risk from Hazard, Vulnerability, and Exposure to climate change in 2040-2049. This interactive map allows users to explore potential impacts to their area and others. This is presented alongside a similarly interactive scatter plot intended to show anticipated state precipitation and temperature changes for the same time period."
                )
                subSection(
                    "Idea Generation and Dataset Search",
                    listOf("    When the project first began, we knew we wanted to talk about climate change as it is a often discussed yet lesser understood topic. There is also a wide amount of data available for us to use, however it is often not presented with the average person in mind. This led to the choice of the general public with the goal of communicating trends and patterns in a way that illustrates potential personal impacts.",
                        "    From there, the datasets needed to be narrowed down to what is the most relevant for our users. However, the inclusion of not only the frequently seen and utilized temperature change data, but also potential changes in weather patterns and future risks to users was considered necessary. This led to using sources such as NASA Goddard Institute for Space Studies and OECD data sets.")
                )
                subSection(
                    "Narrative Design",
                    listOf("    Visualization is a powerful tool to present information, but it is best done so with a powerful narrative to guide the user through the visualizations. To achieve this, it was decided to use a wine glass approach. We started broad with the temperature change data. It is expected that the user has some understanding of this data, or has heard of the principle before. So here, we present it in an approachable way, and explain why this matters. From there, the user is exposed to more detailed and specific datasets such as exposure to weather events by country, precipitation change, and Delta-O-18 levels. Each of these are explained to allow greater understanding how the temperature may correlate with these more extreme changes. Finally, the user is allowed to explore a map with different county data that is interactive and explains the different risks. This section is intended to personalize the data to a user’s specific risk level.")
                )
                subSection(
                    "Visualization Design",
                    listOf("The visualizations were created in Tableau (with an exception of one using the Sand Dance application). Important considerations that were kept in mind included:\n" +
                            "        *  How will the user interact with the visualization? Do they select or hover? How long should they spend on each item?\n" +
                            "        *  How can the design remain cohesive through color, font, and general aesthetic?\n" +
                            "        *  How can I best display this information? What type of visualization should be optimized?\n" +
                            "\n" +
                            "An example of this can be seen below with both visualizations displaying the same data with different colors, and representations. The left heat map is perhaps more self explanatory to the user, while the right radar chart is more experimental but focuses on individual months."),
                    listOf(listOf("/images/ClimateInMotion/ExperimentalImages.png", "Experimental Images")),
                    listOf(0),
                )
                subSection(
                    "Tying it all Together",
                    listOf("Once the final Visualizations were complete, they were combined into scroll able website presenting the visualizations and the story that leads the user down the expected path.")
                )
                LinkText(
                    "To view the final design please go to: ",
                    "https://climatechanges.github.io/",
                    "Website"
                )
                LinkText(
                    "To view the design video please go to: ",
                    "https://www.youtube.com/watch?v=FjyKbDqj_vs",
                    "Youtube"
                )
            }
        )
        Footer()
    }
}
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
            }
        )
        Footer()
    }
}
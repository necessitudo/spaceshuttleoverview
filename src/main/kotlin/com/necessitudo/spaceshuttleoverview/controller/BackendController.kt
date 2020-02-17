package com.necessitudo.spaceshuttleoverview.controller

import com.necessitudo.spaceshuttleoverview.data.SpaceCraft
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BackendController {

    val listCrafts = listOf<SpaceCraft>(
            SpaceCraft(1,"Enterprise",
                    listOf(
                            "/enterprise/800px-Enterprise_KSC_1979.jpg",
                            "/enterprise/Enterprise_lifted.jpg")
            ),
            SpaceCraft(2, "Columbia", listOf(
                    "/columbia/566175main_columbia-opf.jpg",
                    "/columbia/Space_Shuttle_Columbia_lands_following_STS-62_on_18_March_1994._(cropped).jpg")
            ),
            SpaceCraft(3, "Challenger", listOf(
                    "/challenger/1627px-Challenger_1A.jpg",
                    "challenger/2880px-S83-35803_(cropped).jpg")
            )
    )

    //v1
    @GetMapping("/v1/listCrafts")
    fun getCrafts() = listCrafts

}
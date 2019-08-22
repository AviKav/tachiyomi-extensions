package eu.kanade.tachiyomi.extension.all.comicake

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class ComiCakeFactory : SourceFactory {
    override fun createSources(): List<Source> = getAllComiCake()
}

fun getAllComiCake(): List<Source> {
    return listOf(
        WhimSubs(),
        PTScans(),
        LetItGoScans()
    )
}

class WhimSubs : ComiCake("WhimSubs", "https://whimsubs.xyz", "en")

class PTScans : ComiCake("ProjectTime Scans", "https://read.ptscans.com", "en", "/")

class LetItGoScans : ComiCake("LetItGo Scans", "https://reader.letitgo.scans.today", "en", "/")

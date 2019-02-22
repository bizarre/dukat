package org.jetbrains.dukat.tsmodel

import org.jetbrains.dukat.astCommon.Declaration

data class SourceFileDeclaration(
        val fileName: String,
        val root: PackageDeclaration,
        val referencedFiles: List<IdentifierDeclaration>
) : Declaration

package hummfinderapp.alpha.calibration

// Matlab default colormap: parula
val PARULA_COLORMAP_INVERSED = intArrayOf(
    0xf9fb0d, 0xf9f90f, 0xf8f710, 0xf7f512, 0xf7f313, 0xf6f114, 0xf6ef15, 0xf5ed16,
    0xf5ec18, 0xf5ea19, 0xf5e81a, 0xf5e61b, 0xf5e51c, 0xf5e31e, 0xf5e21f, 0xf6e020,
    0xf6df21, 0xf6dd22, 0xf7dc23, 0xf7da24, 0xf8d925, 0xf8d726, 0xf9d627, 0xf9d528,
    0xfad329, 0xfbd22a, 0xfbd12b, 0xfcd02c, 0xfcce2d, 0xfdcd2e, 0xfdcc2f, 0xfeca30,
    0xfec932, 0xffc833, 0xffc634, 0xffc535, 0xffc437, 0xffc238, 0xffc139, 0xffc03b,
    0xfebf3d, 0xfdbe3e, 0xfcbd40, 0xfbbc42, 0xf9bb43, 0xf8ba45, 0xf6ba46, 0xf4ba48,
    0xf2b949, 0xf0b94a, 0xeeb94b, 0xecb94c, 0xeab94d, 0xe8b94f, 0xe6b950, 0xe4ba50,
    0xe2ba51, 0xe0ba52, 0xdeba53, 0xdcba54, 0xdaba55, 0xd8ba56, 0xd6bb57, 0xd4bb58,
    0xd2bb59, 0xd0bb59, 0xcebb5a, 0xccbc5b, 0xcabc5c, 0xc8bc5d, 0xc6bc5e, 0xc3bc5f,
    0xc1bc5f, 0xbfbd60, 0xbdbd61, 0xbbbd62, 0xb9bd63, 0xb7bd64, 0xb4bd65, 0xb2be66,
    0xb0be66, 0xaebe67, 0xabbe68, 0xa9be69, 0xa7be6a, 0xa4be6b, 0xa2bf6c, 0xa0bf6d,
    0x9dbf6e, 0x9bbf6f, 0x98bf70, 0x96bf71, 0x93bf72, 0x91bf73, 0x8ebf74, 0x8cbf75,
    0x89bf76, 0x87bf77, 0x84bf78, 0x81bf79, 0x7ebf7a, 0x7cbf7c, 0x79bf7d, 0x76bf7e,
    0x73bf7f, 0x70bf81, 0x6dbf82, 0x6abf83, 0x67bf85, 0x64be86, 0x61be87, 0x5ebe89,
    0x5bbe8a, 0x58be8c, 0x55bd8d, 0x52bd8f, 0x50bd90, 0x4dbc92, 0x4abc93, 0x47bc95,
    0x44bb96, 0x42bb98, 0x3fba9a, 0x3cba9b, 0x3aba9d, 0x37b99e, 0x35b9a0, 0x32b8a1,
    0x30b8a2, 0x2eb7a4, 0x2bb7a5, 0x29b6a7, 0x27b6a8, 0x25b5aa, 0x23b5ab, 0x21b4ac,
    0x1fb4ae, 0x1db3af, 0x1bb3b0, 0x19b2b2, 0x17b1b3, 0x15b1b4, 0x14b0b5, 0x12b0b7,
    0x10afb8, 0x0fafb9, 0x0daeba, 0x0cadbb, 0x0badbd, 0x0aacbe, 0x09acbf, 0x08abc0,
    0x07aac1, 0x06aac2, 0x06a9c3, 0x06a8c4, 0x05a8c5, 0x05a7c6, 0x05a6c7, 0x05a6c8,
    0x05a5c9, 0x05a4ca, 0x05a3cb, 0x05a2cb, 0x06a2cc, 0x06a1cd, 0x06a0ce, 0x069fce,
    0x069ecf, 0x069dd0, 0x079cd0, 0x079bd1, 0x079ad1, 0x0899d1, 0x0997d2, 0x0a96d2,
    0x0b95d2, 0x0c94d2, 0x0d92d2, 0x0e91d2, 0x0f90d2, 0x108fd2, 0x108dd2, 0x118cd3,
    0x128bd3, 0x128ad3, 0x1388d3, 0x1387d3, 0x1486d4, 0x1485d4, 0x1484d4, 0x1483d5,
    0x1482d5, 0x1481d6, 0x1380d6, 0x137fd7, 0x137ed7, 0x127dd8, 0x127cd8, 0x117bd9,
    0x117ada, 0x1079da, 0x0f78db, 0x0f77db, 0x0e76dc, 0x0d75dc, 0x0c75dd, 0x0b74dd,
    0x0a73de, 0x0972de, 0x0871df, 0x0670df, 0x056ee0, 0x046de0, 0x036ce1, 0x036be1,
    0x026ae1, 0x0169e1, 0x0168e2, 0x0167e2, 0x0165e2, 0x0264e1, 0x0362e1, 0x0561e1,
    0x085fe0, 0x0b5ddf, 0x105bdd, 0x1459dc, 0x1857d9, 0x1c54d6, 0x2052d3, 0x2450d0,
    0x274ecd, 0x294cca, 0x2c4ac6, 0x2d48c3, 0x2f46c0, 0x3145bd, 0x3243b9, 0x3341b6,
    0x3440b3, 0x343eb0, 0x353cad, 0x353ba9, 0x3639a6, 0x3638a3, 0x3636a0, 0x36359d,
    0x36339a, 0x363296, 0x363093, 0x352f90, 0x352d8d, 0x352c8a, 0x352a87, 0x000000
)

val PARULA_COLORMAP = PARULA_COLORMAP_INVERSED.reversed()

val COLORMAP_MAX_INDEX = 255
# UnknownAnimeGamePS
- Contributors are always welcome
- Updated to 5.1

English | [简体中文](README_zh-CN.md)

## Current features

* Logging in

# Star History Chart
[![Star History Chart](https://api.star-history.com/svg?repos=XeonSucksLAB/UnknownAnimeGamePS&type=Date)](https://star-history.com/#XeonSucksLAB/UnknownAnimeGamePS&Date)

# Setup Guide

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL5.1.0 (If you don't have a 5.1.0 client, you can find it here and download it) :


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [GenshinImpact_5.1.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.001) | 10.0 GB | 20.0 GB | cbe2934260fda10ab8cdaca80ef69cb3 |
| [GenshinImpact_5.1.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.002) | 10.0 GB | 20.0 GB | df706bb5e83dde4d3df7276a1210a8fb |
| [GenshinImpact_5.1.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.003) | 10.0 GB | 20.0 GB | dd7062a4abde83f02f184fe081eb2006 |
| [GenshinImpact_5.1.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.004) | 10.0 GB | 20.0 GB | 39f014a760e27f77abed1989739c74c6 |
| [GenshinImpact_5.0.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.005) | 10.0 GB | 20.0 GB | e3beb938f521be5a74431716394baee3 |
| [GenshinImpact_5.1.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.006) | 10.0 GB | 20.0 GB | f59a086e986cce9f9e98e2d3c44212c8 |
| [GenshinImpact_5.1.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/GenshinImpact_5.1.0.zip.007) | 5.94 GB | 11.89 GB | 0e165aec640ca7025f9d52b0f53a4223 |
| [Audio_Chinese_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Chinese_5.1.0.zip) | 13.09 GB | 26.19 GB | 5c2e8a5e8a79a2e04a43e3a9d6df1ade |
| [Audio_English(US)_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_English(US)_5.1.0.zip) | 15.09 GB | 30.20 GB | 2504bd3606681c20cbdb5f82e8ca361b |
| [Audio_Korean_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Korean_5.1.0.zip) | 12.84 GB | 25.70 GB | 89f4668220ceaba401244c5d506defeb |
| [Audio_Japanese_5.1.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240927184459_CVopfb3tD4Zi3As6/Audio_Japanese_5.1.0.zip) | 17.00 GB | 34.02 GB | b2a2d965ccc36b1c583381cf4b3962e9 |

- Or get the 5.0.0 -> 5.1.0 hdiffs:


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [game_5.0.0_5.1.0_hdiff_YqcpfTRBIuOIwHrO.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_5.0.0_5.1.0_hdiff_YqcpfTRBIuOIwHrO.zip) | 18.00 GB | 36.66 GB | 3d628fcde7aaf5b242e253188885ef8d |
| [audio_ko-kr_5.0.0_5.1.0_hdiff_PumQPsFuEgvDnZyX.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_5.0.0_5.1.0_hdiff_PumQPsFuEgvDnZyX.zip) | 0.51 GB | 1.12 GB | 0d77474fe49e46cdfc20298034501019 |
| [audio_ja-jp_5.0.0_5.1.0_hdiff_cSIWEmsNoqluMIrF.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_5.0.0_5.1.0_hdiff_cSIWEmsNoqluMIrF.zip) | 0.59 GB | 1.34 GB | de00c4d5d02dead7b8e80c68ab57db17 |
| [audio_zh-cn_5.0.0_5.1.0_hdiff_bktSOAPsrWSJHOII.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_5.0.0_5.1.0_hdiff_bktSOAPsrWSJHOII.zip) | 0.54 GB | 1.16 GB | 1e988fbd3a6854e885564e3cca56fb65 |
| [audio_en-us_5.0.0_5.1.0_hdiff_jRxUUsOrikPdkOPL.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_5.0.0_5.1.0_hdiff_jRxUUsOrikPdkOPL.zip) | 0.51 GB | 1.11 GB | 501590a0aa8a67e0101e827be5c16cef |


- Download the patch from [here](https://watchandy.me/5.0.0/version.dll). -- The patch has not been updated to 5.1.0 yet.
- Put the `version.dll` in to the folder of your game client. 

## Let's build the server

### 1. Clone the repository

```shell
git clone --recurse-submodules https://github.com/XeonSucksLAB/UnknownAnimeGamePS.git
cd UnknownAnimeGamePS
```

**Curiosity**: Grasscutter uses Gradle to handle dependencies and building.

### 2. Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

[Git](https://git-scm.com/downloads)

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```


## You're done with the building part!

- Launch the server.
- Launch the client and login.

- Enjoy!

### Troubleshooting
- Fiddler or any proxy is required.

### Resources credit
- Dimbreath | AnimeGameData (BinOutput, ExcelBinOutput, TextMap) - https://github.com/DimbreathBot/AnimeGameData
- Hiro420 | GS_Lua (Scripts) - https://github.com/Hiro420/GS_Lua/tree/5.0.0 -- The Lua scripts used in the game client have not been updated
- YuukiPS | GC-Resources (ScriptSceneData, Server) - https://gitlab.com/YuukiPS/GC-Resources -- Server Resources has not been updated
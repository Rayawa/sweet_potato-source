# sweet_potato-source

English | [简体中文](README_zh.md)

Archived source branches for the Sweet Potato Minecraft mod.

Archived project retained for reference.

## Overview

The default `master` branch is a documentation and licensing index. Source code is stored in `1.16.1`, `1.16.3` and `21w05a`. Select a source branch before building; use its `gradle.properties` to identify the actual Minecraft version.

## Technology and Dependencies

The example branch uses Java 8, Gradle Wrapper, Fabric Loom 0.5-SNAPSHOT, Minecraft 1.16.5, Fabric Loader, Fabric API and the Shurlin mod dependency. Dependencies are historical and their repositories may need maintenance.

## Repository Structure

- `README.md` — default-branch index; source branches add src/, build.gradle and Gradle Wrapper
- `LICENSE` — current license text
- `OLD_LICENSE` — historical license text

## Quick Start

Use a separate checkout of a source branch, for example:

```bash
git clone --branch 1.16.3 https://github.com/Rayawa/sweet_potato-source.git
cd sweet_potato-source
./gradlew build
```

Use `gradlew.bat build` on Windows. Check `gradle.properties` before installing the matching JDK/game dependencies. The default `master` branch has no build task. Consult `LICENSE` and `OLD_LICENSE` for the retained licensing material.

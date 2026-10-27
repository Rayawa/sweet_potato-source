# sweet_potato-source

[English](README.md) | 简体中文

烤地瓜 Minecraft 模组的归档源码分支。

归档项目，保留用于参考。

## 项目概述

默认 `master` 分支用于文档与许可索引。源码位于 `1.16.1`、`1.16.3` 和 `21w05a`。构建前先选择源码分支，并以其中的 `gradle.properties` 确认实际 Minecraft 版本。

## 技术栈与依赖

示例分支使用 Java 8、Gradle Wrapper、Fabric Loom 0.5-SNAPSHOT、Minecraft 1.16.5、Fabric Loader、Fabric API 及 Shurlin 模组依赖。依赖较旧，可能需要维护依赖仓库。

## 文件结构

- `README.md` — 默认分支索引；源码分支另含 src/、build.gradle 和 Gradle Wrapper
- `LICENSE` — 当前许可文本
- `OLD_LICENSE` — 历史许可文本

## 快速上手

单独检出一个源码分支，例如：

```bash
git clone --branch 1.16.3 https://github.com/Rayawa/sweet_potato-source.git
cd sweet_potato-source
./gradlew build
```

Windows 使用 `gradlew.bat build`。先检查 `gradle.properties`，再准备匹配的 JDK 和游戏依赖。默认 `master` 分支没有构建任务。许可信息参见 `LICENSE` 与 `OLD_LICENSE`。

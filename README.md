# XDT Syntax

<!-- Plugin description -->
xDT is a Intellij IDE plugin designed to simplify the reading and understanding of files in the xDT format.

The fields catalogue is based on data publicly available on
the [KBV IT update website](https://update.kbv.de/ita-update/Service-Informationen/Feldkatalog/KBV_ITA_SIEX_Feld_und_Regelkatalog.pdf)
as of 08.11.2023.
<!-- Plugin description end -->

![Current File](/assets/screenshot.png "xDT file highlighting")
![Current File](/assets/demo.gif "xDT language injection")

## Features

- Syntax highlighting
- Syntax highlighting for xDT language injection in other files (currently only Kotlin)
- Supplementary information display from the fields catalogue

## Installation

1. Install a compatible JetBrains IDE, such as IntelliJ IDEA, CLion, PyCharm, or other IntelliJ-based IDEs
2. Launch the IDE and open plugin settings
3. Search for **xdt-syntax** and click install

## Usage

- Files with extension ***.xdt** are automatically highlighted
- In other files, such as Kotlin, XDT language can be injected into strings. It happens automatically if the content
  looks like it has xDT lines.

## Support Further Development

<a href="https://www.buymeacoffee.com/aignatev" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

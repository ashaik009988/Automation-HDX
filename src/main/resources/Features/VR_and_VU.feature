Feature: checking vr and vu file generated or not

  Scenario Outline: 01- checking vr file generted are not for given wms code on the day of creation
    Given User is able login sftp application
    Then User is able click on from hdx icon
    Then User is able to click om wms icon
    Then User is able to validate the file using "<Wms code>"
    Examples:
      |Wms code     |
      |AXS000024087 |

  Scenario Outline: 02- checking vu file generted are not for given wms code on the day of creation
    Given User is able login sftp application
    Then User is able click on from hdx icon
    Then User is able to click om wms icon
    Then User is able to validate the file using "<Wms code>" for VU
    Examples:
      |Wms code     |
      |AXS000024087 |

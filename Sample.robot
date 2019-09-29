{
  "name": "Sample",
  "defaultLocale": "en_US",
  "metadata":"[{"key":"ta","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnK"},"name":"ta","strict_locator":"name=btnK"},{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"css","value":"css=div.FPdoLc.VlcLAe > center > input[name=\"btnK\"]"},"name":"ta","strict_locator":"css=div.FPdoLc.VlcLAe > center > input[name=\"btnK\"]"}]},{"key":"vf","value":[{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"name","value":"name=btnI"},"name":"vf","strict_locator":"name=btnI"},{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"css","value":"css=div.FPdoLc.VlcLAe > center > input[name=\"btnI\"]"},"name":"vf","strict_locator":"css=div.FPdoLc.VlcLAe > center > input[name=\"btnI\"]"},{"class":"Button","frameName":"","locator":{"tag_name":"INPUT","type":"xpath","value":"//form[@id='tsf']/div[2]/div/div[3]/center/input[2]"},"name":"vf","strict_locator":"//form[@id='tsf']/div[2]/div/div[3]/center/input[2]"}]}]",
  "elements": [
    {
      "name": "ta",
      "class": "Button",
      "locale": [
        {
          "name": "en_US",
          "locator": "name=btnK"
        }
      ],
      "wait": {
        "until": "visible",
        "for": 45
      }
    }
,    {
      "name": "vf",
      "class": "Button",
      "locale": [
        {
          "name": "en_US",
          "locator": "name=btnI"
        }
      ],
      "wait": {
        "until": "visible",
        "for": 45
      }
    }
  ]
}

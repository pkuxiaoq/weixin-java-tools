package chanjarster.weixin.bean;

import chanjarster.weixin.util.json.WxGsonBuilder;

/**
 * 微信用户分组
 * @author chanjarster
 *
 */
public class WxGroup {

  private long id;
  private String name;
  private long count;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getCount() {
    return count;
  }
  public void setCount(long count) {
    this.count = count;
  }
  
  public static WxGroup fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxGroup.class);
  }
  
  public String toJson(String json) {
    return WxGsonBuilder.create().toJson(this);
  }
  
}

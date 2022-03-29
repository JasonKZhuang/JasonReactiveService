
package com.zhuangkaizhi.reactiveservice.hello;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Jason Zhuang
 * @date : 29/3/2022
 * @description :
 */
@Data
@NoArgsConstructor
@ToString
public class Greeting {
  private String message;

  public Greeting(String message) {
    this.message = message;
  }
}
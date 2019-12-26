package com.xll.season;

/**
 *  季节枚举  ,  实现Weather接口
 *    每个枚举值都需要实现该方法
 */
public enum Season implements Weather{
    SPRING{
        @Override
        public void showWeather() {
            System.out.println(this.name() + " 春天很暖");
        }
    },
    SUMMER {
        @Override
        public void showWeather() {
            System.out.println(this.name() + " 夏天很热");
        }
    },
    AUTUMN {
        @Override
        public void showWeather() {
            System.out.println(this.name() + " 秋天很爽");
        }
    },
    WINTER {
        @Override
        public void showWeather() {
            System.out.println(this.name() + " 冬天很冷");
        }
    }
}

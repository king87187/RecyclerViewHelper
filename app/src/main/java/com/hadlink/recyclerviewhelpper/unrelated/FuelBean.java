/*
 *
 *   Copyright (c) 2016, lyao. lomoliger@hotmail.com
 *
 *   Part of the code from the open source community,
 *   thanks stackOverflow & gitHub .
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.hadlink.recyclerviewhelpper.unrelated;

import java.math.BigDecimal;

public class FuelBean {
    public float faceVal;
    public float price;
    public int discount;
    public boolean isSelect;
    public String des;//描述

    public FuelBean(String faceVal, int discount, String des) {
        this.faceVal = MathUtil.floatTransfer(new BigDecimal(faceVal).floatValue(), 2);
        this.discount = discount;
        this.price = MathUtil.floatTransfer(this.faceVal * discount / 100, 2);
        this.des = des;
    }
}

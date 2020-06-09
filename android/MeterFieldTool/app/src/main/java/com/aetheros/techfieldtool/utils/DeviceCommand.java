/*
 *                   AETHEROS, INC. CONFIDENTIAL
 *
 * The source code contained or described herein and all documents related
 * to the source code ("Material") are owned by Aetheros, Inc. or its
 * suppliers or licensors. Title to the Material remains with Aetheros or its
 * suppliers and licensors. The Material contains trade secrets and proprietary
 * and confidential information of Aetheros or its suppliers and licensors. The
 * Material is protected by worldwide copyright and trade secret laws and treaty
 * provisions. No part of the Material may be used, copied, reproduced, modified,
 * published, uploaded, posted, transmitted, distributed, or disclosed in any way
 * without the prior express written permission of Aetheros, Inc.
 *
 * No license under any patent, copyright, trade secret or other intellectual
 * property right is granted to or conferred upon you by disclosure or delivery
 * of the Material, either expressly, by implication, inducement, estoppel or
 * otherwise. Any license under such intellectual property rights must be
 * express and approved by Aetheros, Inc. in writing.
 *
 *       Copyright (c) 2020 Aetheros, Inc.  All Rights Reserved.
 *
 *
 */

package com.aetheros.techfieldtool.utils;

import android.graphics.drawable.Drawable;

public class DeviceCommand {
    public static final int WAN_LINK = 1;
    public static final int METER_INFORMATION = 2;
    public static final int SMART_HUB = 3;

    private int commandId;
    private String label;
    private Drawable icon;

    public DeviceCommand(int commandId, String label, Drawable icon) {
        this.commandId = commandId;
        this.label = label;
        this.icon = icon;
    }

    public int getCommandId() {
        return this.commandId;
    }

    public String getLabel() {
        return this.label;
    }

    public Drawable getIconDrawable() {
        return this.icon;
    }
}


// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `encoders.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class EncodersDataHolder extends Ice.ObjectHolderBase<EncodersData>
{
    public
    EncodersDataHolder()
    {
    }

    public
    EncodersDataHolder(EncodersData value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof EncodersData)
        {
            value = (EncodersData)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return EncodersData.ice_staticId();
    }
}

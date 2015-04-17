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
// Generated from file `motors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Gazebo Motors Actuators interaction.
 **/
public interface _MotorsOperationsNC
{
    float getV();

    int setV(float v);

    float getW();

    int setW(float w);

    float getL();

    int setL(float l);
}

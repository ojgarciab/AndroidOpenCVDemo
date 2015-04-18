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
// Generated from file `image.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the image provider.
 **/
public interface ImageProviderPrx extends Ice.ObjectPrx
{
    /**
     * Returns the image source description.
     **/
    public ImageDescription getImageDescription();

    /**
     * Returns the image source description.
     * @param __ctx The Context map to send with the invocation.
     **/
    public ImageDescription getImageDescription(java.util.Map<String, String> __ctx);

    /**
     * Returns the image source description.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription();

    /**
     * Returns the image source description.
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription(java.util.Map<String, String> __ctx);

    /**
     * Returns the image source description.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription(Ice.Callback __cb);

    /**
     * Returns the image source description.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Returns the image source description.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription(Callback_ImageProvider_getImageDescription __cb);

    /**
     * Returns the image source description.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageDescription(java.util.Map<String, String> __ctx, Callback_ImageProvider_getImageDescription __cb);

    /**
     * Returns the image source description.
     * @param __result The asynchronous result object.
     **/
    public ImageDescription end_getImageDescription(Ice.AsyncResult __result);

    /**
     * Returns the latest data.
     **/
    public ImageData getImageData()
        throws DataNotExistException,
               HardwareFailedException;

    /**
     * Returns the latest data.
     * @param __ctx The Context map to send with the invocation.
     **/
    public ImageData getImageData(java.util.Map<String, String> __ctx)
        throws DataNotExistException,
               HardwareFailedException;

    /**
     * Returns the latest data.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData();

    /**
     * Returns the latest data.
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData(java.util.Map<String, String> __ctx);

    /**
     * Returns the latest data.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData(Ice.Callback __cb);

    /**
     * Returns the latest data.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Returns the latest data.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData(Callback_ImageProvider_getImageData __cb);

    /**
     * Returns the latest data.
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getImageData(java.util.Map<String, String> __ctx, Callback_ImageProvider_getImageData __cb);

    /**
     * Returns the latest data.
     * @param __result The asynchronous result object.
     **/
    public ImageData end_getImageData(Ice.AsyncResult __result)
        throws DataNotExistException,
               HardwareFailedException;
}
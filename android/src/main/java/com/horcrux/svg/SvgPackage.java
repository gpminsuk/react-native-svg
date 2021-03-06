/**
 * Copyright (c) 2015-present, Horcrux.
 * All rights reserved.
 *
 * This source code is licensed under the MIT-style license found in the
 * LICENSE file in the root directory of this source tree.
 */


package com.horcrux.svg;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SvgPackage implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
            RenderableViewManager.createGroupViewManager(),
            RenderableViewManager.createPathViewManager(),
            RenderableViewManager.createCircleViewManager(),
            RenderableViewManager.createEllipseViewManager(),
            RenderableViewManager.createLineViewManager(),
            RenderableViewManager.createRectViewManager(),
            RenderableViewManager.createTextViewManager(),
            RenderableViewManager.createImageViewManager(),
            RenderableViewManager.createClipPathViewManager(),
            RenderableViewManager.createDefsViewManager(),
            RenderableViewManager.createUseViewManager(),
            RenderableViewManager.createViewBoxViewManager(),
            RenderableViewManager.createLinearGradientManager(),
            RenderableViewManager.createRadialGradientManager(),
            new SvgViewManager());
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}

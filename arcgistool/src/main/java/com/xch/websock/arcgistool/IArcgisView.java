package com.xch.websock.arcgistool;

import android.view.MotionEvent;
import android.widget.TextView;

import com.esri.arcgisruntime.concurrent.ListenableFuture;
import com.esri.arcgisruntime.geometry.Geometry;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.geometry.Polygon;
import com.esri.arcgisruntime.geometry.SpatialReference;
import com.esri.arcgisruntime.internal.jni.CoreMapView;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.AnimationCurve;
import com.esri.arcgisruntime.mapping.view.BackgroundGrid;
import com.esri.arcgisruntime.mapping.view.Callout;
import com.esri.arcgisruntime.mapping.view.Grid;
import com.esri.arcgisruntime.mapping.view.LocationDisplay;
import com.esri.arcgisruntime.mapping.view.MapRotationChangedListener;
import com.esri.arcgisruntime.mapping.view.MapScaleChangedListener;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.mapping.view.SketchEditor;
import com.esri.arcgisruntime.mapping.view.ViewLabelProperties;
import com.esri.arcgisruntime.mapping.view.WrapAroundMode;

/**
 * Author:xch
 * Date:2019/5/9
 * Description:
 */
public interface IArcgisView extends IGeoView{

    void dispose();

    SpatialReference getSpatialReference();

    WrapAroundMode getWrapAroundMode();

    void setWrapAroundMode(WrapAroundMode wrapAroundMode);

    double getMapScale();

    double getMapRotation();

    BackgroundGrid getBackgroundGrid();

    void setBackgroundGrid(BackgroundGrid backgroundGrid);

    double getUnitsPerDensityIndependentPixel();

    Polygon getVisibleArea();

    void setMagnifierEnabled(boolean magnifierEnabled);

    boolean isMagnifierEnabled();

    void setCanMagnifierPanMap(boolean canMagnifierPanMap);

    boolean canMagnifierPanMap();

    ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint, float durationSeconds, AnimationCurve animationCurve);

    ListenableFuture<Boolean> setViewpointCenterAsync(Point point);

    ListenableFuture<Boolean> setViewpointGeometryAsync(Geometry boundingGeometry);

    ListenableFuture<Boolean> setViewpointGeometryAsync(Geometry boundingGeometry, double padding);

    ListenableFuture<Boolean> setViewpointRotationAsync(double angleDegrees);

    ListenableFuture<Boolean> setViewpointScaleAsync(double scale);

    ListenableFuture<Boolean> setViewpointCenterAsync(Point center, double scale);

    void setZOrderMediaOverlay(boolean isMediaOverlay);

    ArcGISMap getMap();

    void setMap(ArcGISMap map);

    Callout getCallout();

    Point locationToScreen(Point mapPoint);

    Point screenToLocation(Point screenPoint);

    void setViewInsets(double left, double top, double right, double bottom);

    double getViewInsetLeft();

    double getViewInsetRight();

    double getViewInsetTop();

    double getViewInsetBottom();

    boolean isViewInsetsValid();

    LocationDisplay getLocationDisplay();

    void setOnTouchListener(MapView.OnTouchListener onTouchListener);

    void addMapRotationChangedListener(MapRotationChangedListener listener);

    boolean removeMapRotationChangedListener(MapRotationChangedListener listener);

    void addMapScaleChangedListener(MapScaleChangedListener listener);

    boolean removeMapScaleChangedListener(MapScaleChangedListener listener);

    android.view.View.OnTouchListener getOnTouchListener();

    boolean onTouchEvent(MotionEvent event);

    void setSketchEditor(SketchEditor sketchEditor);

    SketchEditor getSketchEditor();

    void setGrid(Grid grid);

    Grid getGrid();

    ViewLabelProperties getLabeling();

    void setLabeling(ViewLabelProperties viewLabelProperties);

    CoreMapView getInternal();

    void logFrameRate(TextView textView);

}

package com.xch.websock.arcgistool;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.esri.arcgisruntime.concurrent.ListenableFuture;
import com.esri.arcgisruntime.geometry.Geometry;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.geometry.Polygon;
import com.esri.arcgisruntime.geometry.SpatialReference;
import com.esri.arcgisruntime.internal.jni.CoreMapView;
import com.esri.arcgisruntime.layers.Layer;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Bookmark;
import com.esri.arcgisruntime.mapping.SelectionProperties;
import com.esri.arcgisruntime.mapping.TimeExtent;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.AnimationCurve;
import com.esri.arcgisruntime.mapping.view.AttributionTextChangedListener;
import com.esri.arcgisruntime.mapping.view.BackgroundGrid;
import com.esri.arcgisruntime.mapping.view.Callout;
import com.esri.arcgisruntime.mapping.view.DrawStatus;
import com.esri.arcgisruntime.mapping.view.DrawStatusChangedListener;
import com.esri.arcgisruntime.mapping.view.GraphicsOverlay;
import com.esri.arcgisruntime.mapping.view.Grid;
import com.esri.arcgisruntime.mapping.view.IdentifyGraphicsOverlayResult;
import com.esri.arcgisruntime.mapping.view.IdentifyLayerResult;
import com.esri.arcgisruntime.mapping.view.LayerViewStateChangedListener;
import com.esri.arcgisruntime.mapping.view.LayerViewStatus;
import com.esri.arcgisruntime.mapping.view.LocationDisplay;
import com.esri.arcgisruntime.mapping.view.MapRotationChangedListener;
import com.esri.arcgisruntime.mapping.view.MapScaleChangedListener;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.mapping.view.NavigationChangedListener;
import com.esri.arcgisruntime.mapping.view.SketchEditor;
import com.esri.arcgisruntime.mapping.view.SpatialReferenceChangedListener;
import com.esri.arcgisruntime.mapping.view.ViewLabelProperties;
import com.esri.arcgisruntime.mapping.view.ViewpointChangedListener;
import com.esri.arcgisruntime.mapping.view.WrapAroundMode;
import com.esri.arcgisruntime.util.ListenableList;

import java.util.EnumSet;
import java.util.List;

/**
 * Author:xch
 * Date:2019/5/9
 * 因为 IArcgisView 中的方法比较多，所以在此提供了一个简单版本，
 * 只需要实现其中关注的方法即可。
 */
public class SimpleListener implements IArcgisView {

    @Override
    public DrawStatus getDrawStatus() {
        return null;
    }

    @Override
    public boolean isAttributionTextVisible() {
        return false;
    }

    @Override
    public void setAttributionTextVisible(boolean visible) {

    }

    @Override
    public String getAttributionText() {
        return null;
    }

    @Override
    public boolean isNavigating() {
        return false;
    }

    @Override
    public boolean isWrapAroundEnabled() {
        return false;
    }

    @Override
    public void setViewpoint(Viewpoint viewpoint) {

    }

    @Override
    public ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint, float durationSeconds) {
        return null;
    }

    @Override
    public Viewpoint getCurrentViewpoint(Viewpoint.Type viewpointType) {
        return null;
    }

    @Override
    public EnumSet<LayerViewStatus> getLayerViewState(Layer layer) {
        return null;
    }

    @Override
    public void addDrawStatusChangedListener(DrawStatusChangedListener listener) {

    }

    @Override
    public boolean removeDrawStatusChangedListener(DrawStatusChangedListener listener) {
        return false;
    }

    @Override
    public void addSpatialReferenceChangedListener(SpatialReferenceChangedListener listener) {

    }

    @Override
    public boolean removeSpatialReferenceChangedListener(SpatialReferenceChangedListener listener) {
        return false;
    }

    @Override
    public void addNavigationChangedListener(NavigationChangedListener listener) {

    }

    @Override
    public boolean removeNavigationChangedListener(NavigationChangedListener listener) {
        return false;
    }

    @Override
    public void addLayerViewStateChangedListener(LayerViewStateChangedListener listener) {

    }

    @Override
    public boolean removeLayerViewStateChangedListener(LayerViewStateChangedListener listener) {
        return false;
    }

    @Override
    public void addViewpointChangedListener(ViewpointChangedListener listener) {

    }

    @Override
    public boolean removeViewpointChangedListener(ViewpointChangedListener listener) {
        return false;
    }

    @Override
    public void addAttributionTextChangedListener(AttributionTextChangedListener listener) {

    }

    @Override
    public boolean removeAttributionTextChangedListener(AttributionTextChangedListener listener) {
        return false;
    }

    @Override
    public ListenableList<GraphicsOverlay> getGraphicsOverlays() {
        return null;
    }

    @Override
    public ListenableFuture<IdentifyGraphicsOverlayResult> identifyGraphicsOverlayAsync(GraphicsOverlay graphicsOverlay, android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults) {
        return null;
    }

    @Override
    public ListenableFuture<IdentifyGraphicsOverlayResult> identifyGraphicsOverlayAsync(GraphicsOverlay graphicsOverlay, android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly) {
        return null;
    }

    @Override
    public ListenableFuture<List<IdentifyGraphicsOverlayResult>> identifyGraphicsOverlaysAsync(android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults) {
        return null;
    }

    @Override
    public ListenableFuture<List<IdentifyGraphicsOverlayResult>> identifyGraphicsOverlaysAsync(android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly) {
        return null;
    }

    @Override
    public ListenableFuture<IdentifyLayerResult> identifyLayerAsync(Layer layer, android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly) {
        return null;
    }

    @Override
    public ListenableFuture<IdentifyLayerResult> identifyLayerAsync(Layer layer, android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults) {
        return null;
    }

    @Override
    public ListenableFuture<List<IdentifyLayerResult>> identifyLayersAsync(android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly) {
        return null;
    }

    @Override
    public ListenableFuture<List<IdentifyLayerResult>> identifyLayersAsync(android.graphics.Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults) {
        return null;
    }

    @Override
    public ListenableFuture<Bitmap> exportImageAsync() {
        return null;
    }

    @Override
    public void setTimeExtent(TimeExtent timeExtent) {

    }

    @Override
    public TimeExtent getTimeExtent() {
        return null;
    }

    @Override
    public SelectionProperties getSelectionProperties() {
        return null;
    }

    @Override
    public void dispose() {

    }

    @Override
    public ListenableFuture<Boolean> setBookmarkAsync(Bookmark bookmark) {
        return null;
    }

    @Override
    public void addAttributionViewLayoutChangeListener(View.OnLayoutChangeListener layoutChangeListener) {

    }

    @Override
    public void removeAttributionViewLayoutChangeListener(View.OnLayoutChangeListener layoutChangeListener) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public String getGLESVersionLog() {
        return null;
    }

    @Override
    public SpatialReference getSpatialReference() {
        return null;
    }

    @Override
    public WrapAroundMode getWrapAroundMode() {
        return null;
    }

    @Override
    public void setWrapAroundMode(WrapAroundMode wrapAroundMode) {

    }

    @Override
    public double getMapScale() {
        return 0;
    }

    @Override
    public double getMapRotation() {
        return 0;
    }

    @Override
    public BackgroundGrid getBackgroundGrid() {
        return null;
    }

    @Override
    public void setBackgroundGrid(BackgroundGrid backgroundGrid) {

    }

    @Override
    public double getUnitsPerDensityIndependentPixel() {
        return 0;
    }

    @Override
    public Polygon getVisibleArea() {
        return null;
    }

    @Override
    public void setMagnifierEnabled(boolean magnifierEnabled) {

    }

    @Override
    public boolean isMagnifierEnabled() {
        return false;
    }

    @Override
    public void setCanMagnifierPanMap(boolean canMagnifierPanMap) {

    }

    @Override
    public boolean canMagnifierPanMap() {
        return false;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint, float durationSeconds, AnimationCurve animationCurve) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointCenterAsync(Point point) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointGeometryAsync(Geometry boundingGeometry) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointGeometryAsync(Geometry boundingGeometry, double padding) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointRotationAsync(double angleDegrees) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointScaleAsync(double scale) {
        return null;
    }

    @Override
    public ListenableFuture<Boolean> setViewpointCenterAsync(Point center, double scale) {
        return null;
    }

    @Override
    public void setZOrderMediaOverlay(boolean isMediaOverlay) {

    }

    @Override
    public ArcGISMap getMap() {
        return null;
    }

    @Override
    public void setMap(ArcGISMap map) {

    }

    @Override
    public Callout getCallout() {
        return null;
    }

    @Override
    public Point locationToScreen(Point mapPoint) {
        return null;
    }

    @Override
    public Point screenToLocation(Point screenPoint) {
        return null;
    }

    @Override
    public void setViewInsets(double left, double top, double right, double bottom) {

    }

    @Override
    public double getViewInsetLeft() {
        return 0;
    }

    @Override
    public double getViewInsetRight() {
        return 0;
    }

    @Override
    public double getViewInsetTop() {
        return 0;
    }

    @Override
    public double getViewInsetBottom() {
        return 0;
    }

    @Override
    public boolean isViewInsetsValid() {
        return false;
    }

    @Override
    public LocationDisplay getLocationDisplay() {
        return null;
    }

    @Override
    public void setOnTouchListener(MapView.OnTouchListener onTouchListener) {

    }

    @Override
    public void addMapRotationChangedListener(MapRotationChangedListener listener) {

    }

    @Override
    public boolean removeMapRotationChangedListener(MapRotationChangedListener listener) {
        return false;
    }

    @Override
    public void addMapScaleChangedListener(MapScaleChangedListener listener) {

    }

    @Override
    public boolean removeMapScaleChangedListener(MapScaleChangedListener listener) {
        return false;
    }

    @Override
    public View.OnTouchListener getOnTouchListener() {
        return null;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override
    public void setSketchEditor(SketchEditor sketchEditor) {

    }

    @Override
    public SketchEditor getSketchEditor() {
        return null;
    }

    @Override
    public void setGrid(Grid grid) {

    }

    @Override
    public Grid getGrid() {
        return null;
    }

    @Override
    public ViewLabelProperties getLabeling() {
        return null;
    }

    @Override
    public void setLabeling(ViewLabelProperties viewLabelProperties) {

    }

    @Override
    public CoreMapView getInternal() {
        return null;
    }

    @Override
    public void logFrameRate(TextView textView) {

    }
}

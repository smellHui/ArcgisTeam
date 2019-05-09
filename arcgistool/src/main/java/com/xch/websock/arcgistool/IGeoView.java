package com.xch.websock.arcgistool;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;

import com.esri.arcgisruntime.concurrent.ListenableFuture;
import com.esri.arcgisruntime.layers.Layer;
import com.esri.arcgisruntime.mapping.Bookmark;
import com.esri.arcgisruntime.mapping.SelectionProperties;
import com.esri.arcgisruntime.mapping.TimeExtent;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.AttributionTextChangedListener;
import com.esri.arcgisruntime.mapping.view.DrawStatus;
import com.esri.arcgisruntime.mapping.view.DrawStatusChangedListener;
import com.esri.arcgisruntime.mapping.view.GraphicsOverlay;
import com.esri.arcgisruntime.mapping.view.IdentifyGraphicsOverlayResult;
import com.esri.arcgisruntime.mapping.view.IdentifyLayerResult;
import com.esri.arcgisruntime.mapping.view.LayerViewStateChangedListener;
import com.esri.arcgisruntime.mapping.view.LayerViewStatus;
import com.esri.arcgisruntime.mapping.view.NavigationChangedListener;
import com.esri.arcgisruntime.mapping.view.SpatialReferenceChangedListener;
import com.esri.arcgisruntime.mapping.view.ViewpointChangedListener;
import com.esri.arcgisruntime.util.ListenableList;

import java.util.EnumSet;
import java.util.List;

/**
 * Author:xch
 * Date:2019/5/9
 * Description:
 */
public interface IGeoView {

     DrawStatus getDrawStatus();
    boolean isAttributionTextVisible();
    void setAttributionTextVisible(boolean visible);
    String getAttributionText();
    boolean isNavigating();
    boolean isWrapAroundEnabled();
    void setViewpoint(Viewpoint viewpoint);
    ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint);
    ListenableFuture<Boolean> setViewpointAsync(Viewpoint viewpoint, float durationSeconds);
    Viewpoint getCurrentViewpoint(Viewpoint.Type viewpointType);
    EnumSet<LayerViewStatus> getLayerViewState(Layer layer);
    void addDrawStatusChangedListener(DrawStatusChangedListener listener);
    boolean removeDrawStatusChangedListener(DrawStatusChangedListener listener);
    void addSpatialReferenceChangedListener(SpatialReferenceChangedListener listener);
    boolean removeSpatialReferenceChangedListener(SpatialReferenceChangedListener listener);
    void addNavigationChangedListener(NavigationChangedListener listener);
    boolean removeNavigationChangedListener(NavigationChangedListener listener);
    void addLayerViewStateChangedListener(LayerViewStateChangedListener listener);
    boolean removeLayerViewStateChangedListener(LayerViewStateChangedListener listener);
    void addViewpointChangedListener(ViewpointChangedListener listener);
    boolean removeViewpointChangedListener(ViewpointChangedListener listener);
    void addAttributionTextChangedListener(AttributionTextChangedListener listener);
    boolean removeAttributionTextChangedListener(AttributionTextChangedListener listener);
    ListenableList<GraphicsOverlay> getGraphicsOverlays();
    ListenableFuture<IdentifyGraphicsOverlayResult> identifyGraphicsOverlayAsync(GraphicsOverlay graphicsOverlay, Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults);
    ListenableFuture<IdentifyGraphicsOverlayResult> identifyGraphicsOverlayAsync(GraphicsOverlay graphicsOverlay, Point screenPoint, double tolerance, boolean returnPopupsOnly);
    ListenableFuture<List<IdentifyGraphicsOverlayResult>> identifyGraphicsOverlaysAsync(Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults);
    ListenableFuture<List<IdentifyGraphicsOverlayResult>> identifyGraphicsOverlaysAsync(Point screenPoint, double tolerance, boolean returnPopupsOnly);
    ListenableFuture<IdentifyLayerResult> identifyLayerAsync(Layer layer, Point screenPoint, double tolerance, boolean returnPopupsOnly);
    ListenableFuture<IdentifyLayerResult> identifyLayerAsync(Layer layer, Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults);
    ListenableFuture<List<IdentifyLayerResult>> identifyLayersAsync(Point screenPoint, double tolerance, boolean returnPopupsOnly);
    ListenableFuture<List<IdentifyLayerResult>> identifyLayersAsync(Point screenPoint, double tolerance, boolean returnPopupsOnly, int maximumResults);
    ListenableFuture<Bitmap> exportImageAsync();
    void setTimeExtent(TimeExtent timeExtent);
    TimeExtent getTimeExtent();
    SelectionProperties getSelectionProperties();
    void dispose();
    ListenableFuture<Boolean> setBookmarkAsync(Bookmark bookmark);
    void addAttributionViewLayoutChangeListener(View.OnLayoutChangeListener layoutChangeListener);
    void removeAttributionViewLayoutChangeListener(View.OnLayoutChangeListener layoutChangeListener);
    void pause();
    void resume();
    String getGLESVersionLog();

}

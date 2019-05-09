package com.xch.websock.arcgistool;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * Author:xch
 * Date:2019/5/9
 * Description:
 */
public class ArcgisView extends LinearLayout {

    private MapView mapView;
    private Context ctx;

    public ArcgisView(Context context) {
        super(context);
        initView(context, new MapView(context));
    }

    public ArcgisView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, new MapView(context, attrs));
    }

    public ArcgisView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, new MapView(context, attrs));
    }

    private void initView(Context ctx, MapView mapView) {
        this.mapView = mapView;
        this.ctx = ctx;
        ArcGISMap map = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, 47.495052, -121.786863, 12);
        mapView.setMap(map);
        addView(mapView);
    }

}

<div class="ReportChartDiv">
    <div>
        <div>
            <h5>Repairs Report</h5>
        </div>
        <div>
            <ul class="Report-Ul">
                <li><div class="ReportBox PendingBox"></div>Pending (<#if reportModel?has_content>${reportModel.pendingRepairs}%   </#if>)</li>
                <li><div class="ReportBox InProgressBox"></div>In Progress (<#if reportModel?has_content>${reportModel.inProgressRepairs}%   </#if>)</li>
                <li><div class="ReportBox CompletedBox"></div>Completed (<#if reportModel?has_content>${reportModel.completedRepairs}%   </#if>)</li>
            </ul>
        </div>
    </div>
    <div class="content Margin-Initial">
        <div class="wrapper">
            <div class="chartjs-size-monitor">
                <div class="chartjs-size-monitor-expand">
                    <div class=""></div>
                </div>
                <div class="chartjs-size-monitor-shrink">
                    <div class=""></div>
                </div>
            </div>
            <canvas id="chart-0" style="display: block; height: 400px; width: 800px;" width="1000" height="500"
                    class="chartjs-render-monitor"></canvas>
        </div>
        <div class="toolbar">
            <button class="btn btn-info Margin-Auto" onclick="togglePieDoughnut()">Toggle Doughnut View</button>
        </div>
    </div>
    <#if reportModel?has_content>
        <div>
            <input type="hidden" id="pendingRepairs" value="${reportModel.pendingRepairs}">
            <input type="hidden" id="inProgressRepairs" value="${reportModel.inProgressRepairs}">
            <input type="hidden" id="completedRepairs" value="${reportModel.completedRepairs}">
        </div>
    </#if>
</div>





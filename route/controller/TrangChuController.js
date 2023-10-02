window.TrangChuController = function ($scope, $routeParams) {
  $scope.title = "đây là trang chủ";
  $scope.themMoi = function () {
    // hiển thị toàn bộ dữ liệu form đẩy vào
    console.log($scope.inputValue);
    // hiển thị chi tiết
    console.log($scope.inputValue.name);
    console.log($scope.inputValue.address);
  };
  $scope.phepCong = function () {
    // console.log("số thứ 1 là:" + $scope.numBer.soMot);
    // console.log("số thứ 2 là:" + $scope.numBer.soHai);
    // console.log("tính tổng = " + ($scope.numBer.soMot + $scope.numBer.soHai));
    $scope.sum =
      parseFloat($scope.numBer.soMot) + parseFloat($scope.numBer.soHai);
    // console.log(sum);
  };
  $scope.login = function () {
    $scope.mess = false;
    if ($scope.user.mk == "thaydinhdz") {
      $scope.mess = true;
    } else {
      alert("mk không chính xác");
    }
  };
  $scope.count = 0;
  $scope.countClick = function () {
    $scope.count++;
  };
};

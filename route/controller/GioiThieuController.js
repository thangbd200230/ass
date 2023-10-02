window.GioiThieuController = function ($scope) {
  $scope.title = "đây là trang giới thiệu";
  //   Khai báo mảng
  $scope.student = [
    {
      ten: "bui dai thang 1",
      namSinh: 2004,
      chuyenNganh: "CNTT",
    },
    {
      ten: "bui dai thang 2",
      namSinh: 2005,
      chuyenNganh: "CNTT2",
    },
  ];
  $scope.createStudent = function () {
    // lấy dữ liệu từ input
    let newstudent = {
      ten: $scope.student.name,
      namSinh: $scope.student.year,
      chuyenNganh: $scope.student.couse,
    };
    // thêm dữ liệu nhập từ ô input vào mảng
    $scope.student.push(newstudent);
  };
};

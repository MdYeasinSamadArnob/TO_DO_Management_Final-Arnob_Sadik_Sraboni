-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2020 at 11:54 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `todomanage`
--

-- --------------------------------------------------------

--
-- Table structure for table `worklist`
--

CREATE TABLE `worklist` (
  `Serial` int(11) NOT NULL,
  `Todo` varchar(500) DEFAULT NULL,
  `Date` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `worklist`
--

INSERT INTO `worklist` (`Serial`, `Todo`, `Date`) VALUES
(1, 'Algorithm Final', '14,December,2020->2 PM'),
(2, 'Software Project -ToDo Management project', '16,December,2020->11:59 PM'),
(3, 'Final Exam', '17,December,2020->9 AM'),
(4, 'Data-Communication Quiz will be taken at that time', '2020,December,2020 -> 8 PM'),
(5, 'My new task', '2020,December,2020 -> 8 AM'),
(6, 'Exam Time', '22,December,2020 -> 2 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `worklist`
--
ALTER TABLE `worklist`
  ADD PRIMARY KEY (`Serial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `worklist`
--
ALTER TABLE `worklist`
  MODIFY `Serial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
